package io.yadnyesh;

import java.util.ArrayList;

/**
 * Created by z063407 on 3/8/17.
 */
public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGrocery(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your list");
        for (int i=0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery Item " + position + " has been modified.");
    }

    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);

    }

    public String findItem(String searchItem) {
        //boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if(position >= 0) {
            return groceryList.get(position);
        }
        return null;
    }

}
