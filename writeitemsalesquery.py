import json
import sys
import csv
from collections import defaultdict


def write_item_sales_query(json_file, workspace):
    with open(json_file) as json_data:
        input_data = json.load(json_data)

    start_d = input_data["startDate"]
    end_d = input_data["endDate"]
    catgName = str(input_data["requestId"]) + "_" + input_data["catgName"].replace(" ", "_").lower()
    mic_hierarchy = False

    outfile = open(workspace + catgName + "_all_dpci.csv", "wb")
    writer = csv.writer(outfile)
    for item in input_data['allDpci']:
        writer.writerow([item])

    outfile.close();

    bb_hql = open(workspace+str(catgName) + "_item_sales.hql", "w")
    bb_hql.write("""
    SET mapred.job.queue.name=analysis;
    SET hive.execution.engine =tez;
    SET tez.queue.name=analysis;
    SET tez.runtime.compress=true;
    SET tez.runtime.compress.codec=org.apache.hadoop.io.compress.SnappyCodec;
    SET hive.merge.tezfiles=true;
    SET hive.tez.auto.reducer.parallelism=true;

    drop table if exists ino_ctgry_clstrng.{catgName}_all_dpci;

    create table if not exists ino_ctgry_clstrng.{catgName}_all_dpci(item_dpci string comment 'Item DPCI');

    LOAD DATA LOCAL INPATH '{workspace}{catgName}_all_dpci.csv' OVERWRITE INTO TABLE ino_ctgry_clstrng.{catgName}_all_dpci;


    with item_universe as(
        from prd_sho_item.mdse_item_dim i inner join ino_ctgry_clstrng.{catgName}_all_dpci d
        on trim(i.dpci_lbl_t) = d.item_dpci
        select distinct mdse_dept_ref_i, mdse_clas_ref_i, mdse_sbcl_ref_i, mdse_item_i, trim(dpci_lbl_t) as dpci, trim(mdse_item_desc_t) as item_description
        where mdse_item_i <> -1
    
       )

    select c.dpci, sum(a.sls_unit_q) as units, sum(a.ext_sls_prc_a) as sales
    from prd_ssl_fnd.mdse_slstr_item_line a
        inner join ino_ctgry_clstrng.{catgName}_master_store_list b on (a.co_loc_i = b.co_loc_i)
        inner join item_universe c on (a.mdse_item_i = c.mdse_item_i)
    where a.p_sls_d between '{start_d}' and '{end_d}'
        and a.rgtn_clas_c = '01'
        and a.sls_mdscl_stat_c not in ('00','04','05','12','13','14')
        and a.sls_type_c not in ('CLH','CLP','CLS','CPM')
    group by dpci;
    """.format(catgName=catgName, start_d=start_d, end_d=end_d, workspace=workspace))
    bb_hql.close()

if __name__ == '__main__':
    write_item_sales_query(sys.argv[1], sys.argv[2])
    
    ### Example code for python
