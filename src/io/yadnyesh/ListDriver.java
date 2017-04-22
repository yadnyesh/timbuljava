package io.yadnyesh;

import java.util.List;

/**
 * Created by z063407 on 4/22/17.
 */
public class ListDriver {

    public static void main(String[] args) {
        ListYad<String> glist = new ListYad<String> (10);
        glist.add("milk");
        glist.add("eggs");
        System.out.println("Grocery List: " + glist.toString());

        ListYad<Integer> numbers = new ListYad<>(5);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers.toString());
    }
}
