package Phrase_Solver;
import java.util.Scanner;

import javafx.scene.layout.BorderStroke;
public class Main {
    public static void main(String[] args) {  

        /*
         * Code By Christian & Aditya!
         * Christian's Work:
         * Underscore Generator
         * Guess Promt and Return new Board after guess + retured already guessed letters
         * 
         * Aditya's Work:
         * Player turn and winner detiminer. Setup when each player goes and how often depending on if they
         * guess correctly.
         * 
         * 
         */

         
        Board Board = new Board();
        Scanner sc = new Scanner(System.in);
        Player player1 = new Player();
        Player player2 = new Player();

        Board.boardClear();

        System.out.println("Welcome Players to Bootleg Wheel of Fortune\nPress Enter To Continue");
        sc.nextLine();

        player1.setName(1);
        player2.setName(2);
        
        while (Board.getRun()) {
        Board.setPhrase();
        System.out.println("Ok Players, here is the puzzle\n");
        
        System.out.println(Board.underscoreCreator());

        System.out.println("\nAlright Let's get guessing!");

        while((Board.theBoard.contains("_"))) {
            Board.changeTurn();

            if (Board.checkTurn()) {
                System.out.println("Your turn " + player1.getName());
            }
            else {
                System.out.println("Your turn " + player2.getName());
            }

            System.out.println(Board.guessPrompt());
            
            System.out.println("\nYou have guessed the following letters:");

            System.out.println(Board.guessedItems + "\n\n");

            if(Board.theBoard.equals(Board.originalPhrase)) {
                break;
            }
        }
        
        if (Board.checkTurn()) {
            System.out.println(player1.getName() + " Wins");
        }
        else {
            System.out.println(player2.getName() + " Wins");
        }
        // frank is a cool kid
        Board.gameEndCheck();

    }
    }
}