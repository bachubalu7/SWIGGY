import java.util.Random;

public class TestPlayerA extends Player{
    public TestPlayerA (String name, int health, int strength, int attack) {
        /*this.name = name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        */
        super(name,health,strength,attack);
    }

    public int rollDie() {
        return 4;
    }
}