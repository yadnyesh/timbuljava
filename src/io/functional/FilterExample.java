package io.functional;

import java.util.Arrays;
import java.util.List;

/**
 * Created by z063407 on 9/2/17.
 */
public class FilterExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Peter", "Sam", "Greg", "Ryan");


        names.stream().filter(name -> isNotSam(name)).forEach(System.out::println);
    }

    private static boolean isNotSam(String name) {
        return !name.equals("Sam");
    }
}
