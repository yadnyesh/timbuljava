package io.yadnyesh;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by z063407 on 5/8/17.
 */
public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1; i <= 100; i++) {
            squares.add(i * i);
            cubes.add(i * i * i);
        }

        System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes.");
        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);

        System.out.println("Union contains " + union.size() + " elements.");

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);

        System.out.println("Intersection contatins " + intersection.size() + " elements.");

        Set<String> words = new HashSet<>();
        String sentence = "one day in the year of the fox";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));
        for (String s : words) {
            System.out.println(s);
        }

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();

        String[] arrayNatureWords = {"all", "nature", "is", "but", "art", "unknown", "to", "thee"};
        nature.addAll(Arrays.asList(arrayNatureWords));
        String[] arrayDivineWords = {"to", "err", "is", "human", "to", "forgive", "divine"};
        divine.addAll(Arrays.asList(arrayDivineWords));

        System.out.println("nature-divine");
        Set<String> diff1 = new HashSet<>(nature);
        diff1.removeAll(divine);
        printSet(diff1);

        System.out.println("divine-nature");
        Set<String> diff2 = new HashSet<>(divine);
        diff2.removeAll(nature);
        printSet(diff2);

    }

        private static void printSet(Set<String> set) {
        System.out.println("\t");
            for(String s : set) {
                System.out.println(s + " ");
            }
         }
}
