package io.yadnyesh;

/**
 * Created by z063407 on 3/8/17.
 */
public class Player {

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <= 0) {
            System.out.println("The Player knocked out");
        }
    }

    public int healthRemaining() {
        return health;
    }
}
