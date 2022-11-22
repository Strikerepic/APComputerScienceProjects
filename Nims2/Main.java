package Nims2;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //Asks the user to input thier name for the player
        System.out.println("What is player1's name?: ");
        String p1Name = sc.nextLine();
        Player p1 = new Player(p1Name);
        //TO DO: Create Player 1

        //Asks the user to input their name for the player.
        System.out.println("What is player2's name?: ");
        String p2Name = sc.nextLine();
        Player p2 = new Player(p2Name);
        //TO DO: Create Player 

        String again = "Literally any string";
        Player currentPlayer;
        
        //Runs the game
        while (!again.equals("q")){
            
            //Generates the game
            //TO DO: Create "game"

            Game game = new Game(p1, p2);

            //TO DO: Set the a random player as the current player
            double goofyNumber = Math.random();
            if(goofyNumber > 0.5) {
                    currentPlayer = p1;
                    game.setFirstPlayer(p1);
                }
                else {
                    currentPlayer = p2;
                    game.setFirstPlayer(p2);
                }

           
            //This is the loop in which the game will be played

            while(!game.isComplete()){
              
                System.out.println(currentPlayer.getName() + " it's your turn!");
                


                if(currentPlayer == p1) {
                    p1.adjustScore(game.takePiece());
                }
                else {
                    p2.adjustScore(game.takePiece());
                }

                currentPlayer = game.getNextPlayer();
                
                
            }


            System.out.println(currentPlayer.getName() + " Won!!");
            System.out.println(p1.getName() +" had removed "+ p1.getScore()+" pieces!");
            System.out.println(p2.getName() +" had removed "+ p2.getScore()+" pieces!");
            System.out.println("------------------------------------------");
            System.out.println("Enter q to quit, enter anything else to play again.");
            again = sc.nextLine();
        }
        System.out.println("Thank you for playing!");
    }
}

