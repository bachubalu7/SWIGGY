public class PlayerTest {

    public static void main(String[] args) {
        testAttack_PlayerA_Wins();
        testAttack_PlayerB_Wins();
        testAttack_BothPlayers_Alive();
        testIsAlive();
    }

    // Test the attack method
    public static void testAttack_PlayerA_Wins() {
        TestPlayerA attacker = new TestPlayerA("Attacker", 100, 10, 33);
        TestPlayerB defender = new TestPlayerB("Defender", 100, 8, 4);

        attacker.attack(defender);
        
        // Assert that the defender's health has decreased
        if (defender.getHealth() == 0) {
            System.out.println("Attack test passed Player 1 Won");
        } 
        else {
            System.out.println("Attack test failed");
        }
    }

    public static void testAttack_PlayerB_Wins() {
        TestPlayerA defender = new TestPlayerA("Defender", 100, 4, 33);
        TestPlayerB attacker = new TestPlayerB("Attacker", 100, 8, 30);

        attacker.attack(defender);
        
        // Assert that the defender's health has decreased
        if (defender.getHealth() == 0) {
            System.out.println("Attack test passed Player 2 Won");
        } 
        else {
            System.out.println("Attack test failed");
        }
    }

    public static void testAttack_BothPlayers_Alive() {
        TestPlayerA attacker = new TestPlayerA("Attacker", 100, 4, 10);
        TestPlayerB defender = new TestPlayerB("Defender", 100, 8, 30);

        attacker.attack(defender);
        
        // Assert that the defender's health has decreased
        if (attacker.getHealth()!=0 && defender.getHealth() != 0) {
            System.out.println("Attack test passed, both players alive");
        } 
        else {
            System.out.println("Attack test failed");
        }
    }

    // Test the isAlive method
    public static void testIsAlive() {
        Player playerAlive = new Player("Alive", 50, 10, 5);
        Player playerDead = new Player("Dead", 0, 10, 5);

        // Assert that the playerAlive is alive
        if (playerAlive.isAlive()) {
            System.out.println("IsAlive test for alive player passed");
        } 
        else {
            System.out.println("IsAlive test for alive player failed");
        }

        // Assert that the playerDead is dead
        if (!playerDead.isAlive()) {
            System.out.println("IsAlive test for dead player passed");
        } 
        else {
            System.out.println("IsAlive test for dead player failed");
        }
    }
}