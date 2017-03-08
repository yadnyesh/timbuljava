package io.yadnyesh;

/**
 * Created by z063407 on 3/8/17.
 */
public class EnhancedPlayer {
    private String name;
    private int health = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health > 0 && health <= 100) {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <= 0) {
            System.out.println("The Player knocked out");
        }
    }

    public int healthRemaining() {
        return health;
    }

    public int getHealth() {
        return health;
    }
}
