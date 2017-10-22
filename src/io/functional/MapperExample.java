package io.functional;

import java.util.Arrays;
import java.util.List;

/**
 * Created by z063407 on 9/2/17.
 */
public class MapperExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Peter", "Sam", "Greg", "Ryan");


        names.stream().filter(name -> isNotSam(name)).forEach(System.out::println);
    }

    private static boolean isNotSam(String name) {
        return !name.equals("Sam");
    }


    class User {
        private String name;
        private Integer age;

        public User(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }
}
