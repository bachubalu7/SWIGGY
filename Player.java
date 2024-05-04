import java.util.Random;

public class Player implements PlayerInterface{
    
    private String name;
    private int health;
    private int strength;
    private int attack;
    private Random random = new Random();
    
    public Player(String name, int health, int strength, int attack) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;

    }
    public int getHealth(){
        return this.health;
    }
    public String getName(){
        return this.name;
    }
    public int getStrength(){
        return this.strength;
    }
    // Method for attacking the opponent
    public void attack(Player opponent) {
        int attackRoll = rollDie();
        int damage = attackRoll * attack;
        System.out.println(name + " attacks with roll " + attackRoll + " and causes " + damage + " damage.");

        int defenseRoll = opponent.rollDie();
        int defense = defenseRoll * opponent.strength;
        System.out.println(opponent.name + " defends with roll " + defenseRoll + " and defends " + defense + " damage.");

        int damageTaken = Math.max(0, damage - defense);
        opponent.health -= damageTaken;
        opponent.health = Math.max(0, opponent.health); // Ensure health does not go below 0
        System.out.println(opponent.name + " takes " + damageTaken + " damage. " + opponent.name + "'s health is now "
                + opponent.health);
    }

    // Method for rolling a six-sided die
    public int rollDie() {
        return random.nextInt( 6) + 1;
    }

    // Method to check if the player is alive
    public boolean isAlive() {
        return health > 0;
    }
}
