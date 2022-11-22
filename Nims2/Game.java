package Nims2;

import java.util.Scanner;
public class Game {
    private int pieces;
    private Player p1;
    private Player p2;
    private Player currentPlayer;
    private Scanner sc = new Scanner(System.in);

    //Sets up the game with a random amount of pieces between 10 and 50
    //Sets up the players so they can be accessed
    public Game(Player p1, Player p2){
        pieces = (int) (Math.random() * 41) + 10;
        this.p1 = p1;
        this.p2 = p2;
    }

    //Allows a player to take a specific amount of pieces.
    //Adds the amount of pieces taken to the user's score.
    public int takePiece(){

        int take = 0;
       //TO DO: Grab the user amount of pieces and repeat if it not allowed.

        while (!isLegal(take)){
            
            System.out.println("There are "+ pieces+" remaining!");
            System.out.println("How many pieces do you want to take?");
            take = sc.nextInt();
        }
        //TO DO: Adjust the pieces
      
        pieces = pieces - take;

        System.out.println("There are "+ pieces+" remaining!");
        System.out.println("-----------------------");
        
        return take;
    }

    
    //**TO DO**//
    public Player getNextPlayer(){
    //Changes which players turn it is and returns the current player.
      
    if(currentPlayer == p2)
     {
         return currentPlayer = p1;
       }
        else {
         return currentPlayer = p2;
        }
    }

    //Checks whether or not the user's requested move is allowed or not.
    public boolean isLegal(int x){

        if(pieces >= 3 ) {

             if(x <= pieces/2 && x > 0) {
               return true;
             }
             else {
                System.out.println("The amount that you take must be less than or equal to half the number of pieces that remain!");
            return false;
                }
            }
        else {

            if((x == 1) && (x>0)) {
            return true;
            }
            else {
                return false;
            }
            }
        }

        
        
    



    //DO NOT CHANGE
    public boolean isComplete(){

        if (pieces == 0){ return true;}
        return false;
    }

    //DO NOT CHANGE
    public void setFirstPlayer(Player p){
        currentPlayer = p;
    }
}
