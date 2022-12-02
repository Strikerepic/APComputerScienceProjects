package GuessingGame;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Guessing Guessing = new Guessing();
        String choice[];
        String easy[] = {"a","b","c","d"};
        String medium[] = {"a","b","c","d","e","f"};
        String hard[] = {"a","b","c","d","e","f","g","h","i"};

    

        boolean gameActive = true;
        boolean wantToPlay = true;
        int roundNum = 1;









        while(wantToPlay == true) {

            
                System.out.println("Select Pain Level\n1:Easy\n2:Medium\n3:Hard");
                String difficultyChoice = sc.nextLine();
                if(difficultyChoice.equals("1")) {
                    choice = easy;
                }
                else if(difficultyChoice.equals("2")) {
                    choice = medium;
                }
                else if(difficultyChoice.equals("3")) {
                    choice = hard;
                }


                gameActive = true;
                roundNum = 1;

        while(gameActive == true) {

        System.out.println("================MEMORIZE THE LIST ================");
        System.out.println(Guessing.printLetterList(choice,roundNum));
        System.out.println("================MEMORIZE THE LIST================");
        
        
        try{Thread.sleep(3000);}catch(InterruptedException e){System.out.println(e);}  


        System.out.print("\033[H\033[2J");
        System.out.println("Retype The List");    
        String guessed = sc.nextLine();


        if(guessed.equals(Guessing.getLetterList())) {
            System.out.println("Correct!");
            roundNum++;
            System.out.println("Welcome to Round " + roundNum +"\nPress Enter To Continue:");
            sc.nextLine();
        }
        else {
            gameActive = false;
        }
        
        }

        System.out.println("OHHHHHH BOZO!");
        

        System.out.println("Want to play again?\n1:Yes\n2:No");
        String gameChoice = sc.nextLine();

        if(gameChoice.equals("1")) {
            wantToPlay = true;
        }
        else {
            wantToPlay = false;
        }
    }

    System.out.println("goodbye!");
    }

}
