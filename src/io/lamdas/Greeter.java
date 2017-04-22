package io.lamdas;

import java.util.Arrays;
import java.util.List;

/**
 * Created by z063407 on 4/20/17.
 */
public class Greeter {

    public void greet() {
        System.out.println("Hello World");
        List<Integer> listOfPrimes = Arrays.asList(2, 3, 5, 7, 11, 13, 17);
        listOfPrimes.stream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        Greeter g = new Greeter();
        g.greet();

    }
}
