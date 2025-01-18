import java.io.Serializable;
public class Enemy implements Serializable{
    private static final long serialVersionUID = 1L;

    private String name;
    private double health;

    private Weapon enemyWeapon;

    private Helmet helmet;
    private Shirt shirt;
    private Trouser trouser;
    private Shoe shoe;

    public Enemy(String name) {
        this.name = "Evil Enemy";
        this.enemyWeapon = new Weapon("Devil's Blade", 7);
        this.health = 50;
    }

    public int attack() {
        return enemyWeapon.getDamage();
    }

    public void takeDamage(double damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }


}
