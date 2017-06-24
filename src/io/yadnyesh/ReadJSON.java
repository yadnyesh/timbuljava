package io.yadnyesh;

/**
 * Created by z063407 on 6/21/17.
 */
public class ReadJSON {

    public static void main(String[] args) {
        JSONObject json = readurl("https://graph.facebook.com/pageid");
        System.out.println(json.toString());
        System.out.println("Page id is:"+json.get("id"));
    }
}
