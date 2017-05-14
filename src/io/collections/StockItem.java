package io.collections;

/**
 * Created by z063407 on 5/14/17.
 */
public class StockItem implements Comparable<StockItem>{
    private final String name;
    private double price;
    private int quantityStock; /// can also be initialized later

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price >0) {
            this.price = price;
        }
    }

    public int getQuantityStock() {
        return quantityStock;
    }

    public void setQuantityStock(int quantityStock) {
        this.quantityStock = quantityStock;
    }

    public void adjustStock(int quantity){
        int newQuantity = this.quantityStock + quantity;
        if(newQuantity > 0) {
            this.quantityStock = newQuantity;
        }
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Entering StockItem.equals");
        if (this == o) return true;

        if (o == null || this.getClass() != o.getClass()) return false;

        StockItem stockItem = (StockItem) o;

//        if (Double.compare(stockItem.price, price) != 0) return false;
//        if (quantityStock != stockItem.quantityStock) return false;
//        return name != null ? name.equals(stockItem.name) : stockItem.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + quantityStock;
        return result;
    }
}
