
package Phrase_Solver;
import java.util.Scanner;
import java.io.File;
public class Board{

//Return a random phrase from the text document

/*
 * Our Note to Mr. J:
 * Hi
 */

private String loadPhrase()
  {
    String tempPhrase = "";
    
    int numOfLines = 0;
    tempPhrase = "how are you";
    try 
    { 
      Scanner sc = new Scanner(new File("/workspace/APComputerScienceProjects/Phrase_Solver/phrases.txt"));
      while (sc.hasNextLine())
      {
        tempPhrase = sc.nextLine().trim();
        numOfLines++;
      }
    } catch(Exception e) { System.out.println("Error reading or parsing phrases.txt"); }
    
		int randomInt = (int) ((Math.random() * numOfLines) + 1);
    
    try 
    {
      int count = 0;
      Scanner sc = new Scanner(new File("/workspace/APComputerScienceProjects/Phrase_Solver/phrases.txt"));
      while (sc.hasNextLine())
      {
        count++;
        String temp = sc.nextLine().trim();
        if (count == randomInt)
        {
          tempPhrase = temp;
        }
      }
    } catch (Exception e) { System.out.println("Error reading or parsing phrases.txt"); }
    return tempPhrase;
  }

  String theBoard = "";
  private String phraseHolder;
  String originalPhrase;

  public void setPhrase() {
    phraseHolder = loadPhrase();
    originalPhrase = phraseHolder;
  }

  public String underscoreCreator() {

    String phrase = phraseHolder;
    String newBoard = "";

    for(int i = 0; i < phrase.length(); i++) {

      if (phrase.substring(i, i+1).equals(" ")) {
        newBoard += " ";
      }
      else {
        newBoard += "_";
      }
    }

    theBoard = newBoard;
    return newBoard;
  }

  String guessedItems = "";   //Creates a sort of list of already guessed letters. Scope must be the entire board class not just the

  // guessPrompt() Method...

  public String guessPrompt() {
    boolean correctLetter = true;
    while (correctLetter) {
      System.out.println("Guess Letter Here:");
      Scanner sc = new Scanner(System.in);
      String guessLetter = "";
      boolean didLoop = false;
      boolean validInput = false;
      /*
      * Below Checks to see if the user entered anything but an *ENTERKEY* or more than one letter
      */

      while(validInput == false) {

      guessLetter = sc.nextLine();
        if (guessLetter.equals("") || guessLetter.length() > 1 || guessLetter.equals(" ")) {
          System.out.println("INVALID INPUT DO IT AGAIN!");
      }
      else {
        validInput = true;
      }
      }

      
      guessedItems += guessLetter + ", ";
      
      while(phraseHolder.contains(guessLetter)) {

      int location = phraseHolder.indexOf(guessLetter);
      phraseHolder = phraseHolder.substring(0, location) + "_"  + phraseHolder.substring(location+1);
      theBoard = theBoard.substring(0,location) + guessLetter + theBoard.substring(location+1); 
      didLoop = true;
      }
      System.out.println(theBoard);

      // Swaps Like this ||| Hi to __ then _i to H_

      if(didLoop == false) {
        System.out.println("The puzzle did not contain that letter");
        correctLetter = false;
      }
  }
    return theBoard;
  }

  public void boardClear() {
    System.out.println("\033[H\033[2J");
  }

  private boolean turn;
  public boolean checkTurn() {
    return turn;
  }
  public void changeTurn() {
    turn = !turn;
  }
  private boolean run = true;
  public boolean getRun() {
    return run;
  }
  public void gameEndCheck() {
    Scanner sc2 = new Scanner(System.in);
    System.out.println("Would you like to play again? (y/n)");
    String endCheck = sc2.nextLine();
    if (endCheck.equals("n")) {
      run = false;
    }
  }
}