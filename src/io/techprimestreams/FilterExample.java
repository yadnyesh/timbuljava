package io.techprimestreams;

import java.util.Arrays;
import java.util.List;

/**
 * Created by z063407 on 9/24/17.
 */
public class FilterExample {
    public static void main(String[] args) {
        List<String > names = Arrays.asList("Peter", "Sam", "Greg", "Ryan");
        names.stream()
                .filter(name -> !name.equals("Sam"))
                .forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);


    }
}
