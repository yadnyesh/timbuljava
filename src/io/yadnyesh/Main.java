package io.yadnyesh;

/**
 * Created by z063407 on 3/4/17.
 */
public class Main {
    public static void main (String args[]) {

        Animal animal = new Animal("Animal", 1, 1, 5,5);

        Dog dog = new Dog("Yorkie", 8, 29, 2, 4, 1,20, "long silky");
        dog.run();
    }
}
