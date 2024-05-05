import java.util.*;
// MagicalArena class to manage the game
public class MagicalArena {
    public static void main(String[] args) {
    ConsoleInputReader scanner = new ConsoleInputReader();
	Player player1 = null;
    Player player2 = null;
    boolean endGame = false;
    while(!endGame){
        System.out.println("please choose value accordingly\n 1.Enter player details\n 2.Start the game\n 3.Quit");
        int option = scanner.nextInt();
        switch(option){
            case 1:{
                //Take input for Player1
                System.out.println("Enter details for Player 1:");
                player1 = MagicalArena.getPlayerInput(scanner);

                // Take input for Player2
                System.out.println("Enter details for Player 2:");
                player2 = MagicalArena.getPlayerInput(scanner);
                           
            break;
            }
            case 2:{
                if(player1!=null && player2!=null){
                    while (player1.isAlive() && player2.isAlive()) {
                        Player least = checkLeastHealthPlayer(player1,player2);
                        if(least == player1)
                        {
                            player1.attack(player2);
                            if (!player2.isAlive()) {
                                System.out.println(player1.getName() + " wins!");
                                break;
                            }
                            player2.attack(player1);
                            if (!player1.isAlive()) {
                                System.out.println(player2.getName() + " wins!");
                                break;
                            }
                        }
                    }
                    if (!player1.isAlive() && !player2.isAlive()) {
                        System.out.println("Both players died simultaneously!");
                    }   
                }
                else{
                    System.out.println("You can only start the game after giving the players details\nplease select 1");
                }
            break;
            }
            case 3:{
                endGame = true;
                break;
            
            }
        }
        
    }
    }
    public static Player checkLeastHealthPlayer(Player player1, Player player2){
        if(player1.getHealth() <= player2.getHealth())
            return player1;
        return player2;
    }
    public static Player getPlayerInput(ConsoleInputReader scanner) {
        System.out.println("Enter name: ");
        String name = scanner.next();

        System.out.println("Enter health: ");
        int health = scanner.nextInt();

        System.out.println("Enter strength: ");
        int strength = scanner.nextInt();

        System.out.println("Enter attack: ");
        int attack = scanner.nextInt();

        // Consume the newline character after reading integers
        scanner.nextLine();

        return new Player(name, health, strength, attack);
    }
}
