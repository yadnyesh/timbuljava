package io.yadnyesh;

/**
 * Created by z063407 on 3/4/17.
 */
public class Main {
    public static void main (String args[]) {

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();

        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.12);

        price = hamburger.itemizeHamburger();
        System.out.println("Total Burger Price is: $" + price);

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthAddition1("Lentils", 3.41);
        healthyBurger.itemizeHamburger();
        System.out.println("Total Healthy Burger Price is: $" + healthyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizeHamburger();

    }
}
