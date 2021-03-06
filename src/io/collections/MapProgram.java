package io.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by z063407 on 3/29/17.
 */
public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "Compiled High Level OO, PI Language");
        languages.put("Python", "Interpreted, OO, High level");
        languages.put("Algol", "Algorithmic Language");
        languages.put("BASIC", "Beginners All purpose symbolic instruction code");
        languages.put("Lisp", "There lies madness");


        languages.replace("Java", "Still trying to learn it");
        System.out.println(languages.containsKey("Java"));
        System.out.println(languages.get("Java"));

        System.out.println("===================");

        for (String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
