import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;

/**
 * Class that contains helper methods for the Review Lab
 **/
public class Review {
  
  private static HashMap<String, Double> sentiment = new HashMap<String, Double>();
  private static ArrayList<String> posAdjectives = new ArrayList<String>();
  private static ArrayList<String> negAdjectives = new ArrayList<String>();
 
  
  private static final String SPACE = " ";
  
  static{
    try {
      Scanner input = new Scanner(new File("/workspace/APComputerScienceProjects/ConsumerLab_Code/cleanSentiment.csv"));
      while(input.hasNextLine()){
        String[] temp = input.nextLine().split(",");
        sentiment.put(temp[0],Double.parseDouble(temp[1]));
        //System.out.println("added "+ temp[0]+", "+temp[1]);
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing cleanSentiment.csv");
    }
  
  
  //read in the positive adjectives in postiveAdjectives.txt
     try {
      Scanner input = new Scanner(new File("/workspace/APComputerScienceProjects/ConsumerLab_Code/positiveAdjectives.txt"));
      while(input.hasNextLine()){
        String temp = input.nextLine().trim();
        System.out.println(temp);
        posAdjectives.add(temp);
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
    }   
 
  //read in the negative adjectives in negativeAdjectives.txt
     try {
      Scanner input = new Scanner(new File("/workspace/APComputerScienceProjects/ConsumerLab_Code/negativeAdjectives.txt"));
      while(input.hasNextLine()){
        negAdjectives.add(input.nextLine().trim());
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing negativeAdjectives.txt");
    }   
  }
  
  /** 
   * returns a string containing all of the text in fileName (including punctuation), 
   * with words separated by a single space 
   */
  public static String textToString( String fileName )
  {  
    String temp = "";
    try {
      Scanner input = new Scanner(new File(fileName));
      
      //add 'words' in the file to the string, separated by a single space
      while(input.hasNext()){
        temp = temp + input.next() + " ";
      }
      input.close();
      
    }
    catch(Exception e){
      System.out.println("Unable to locate " + fileName);
    }
    //make sure to remove any additional space that may have been added at the end of the string.
    return temp.trim();
  }
  
  /**
   * @returns the sentiment value of word as a number between -1 (very negative) to 1 (very positive sentiment) 
   */
  public static double sentimentVal( String word )
  {
    try
    {
      return sentiment.get(word.toLowerCase());
    }
    catch(Exception e)
    {
      return 0;
    }
  }
  
  /**
   * Returns the ending punctuation of a string, or the empty string if there is none 
   */
  public static String getPunctuation( String word )
  { 
    String punc = "";
    for(int i=word.length()-1; i >= 0; i--){
      if(!Character.isLetterOrDigit(word.charAt(i))){
        punc = punc + word.charAt(i);
      } else {
        return punc;
      }
    }
    return punc;
  }

      /**
   * Returns the word after removing any beginning or ending punctuation
   */
  public static String removePunctuation( String word )
  {
    while(word.length() > 0 && !Character.isAlphabetic(word.charAt(0)))
    {
      word = word.substring(1);
    }
    while(word.length() > 0 && !Character.isAlphabetic(word.charAt(word.length()-1)))
    {
      word = word.substring(0, word.length()-1);
    }
    
    return word;
  }
 
  /** 
   * Randomly picks a positive adjective from the positiveAdjectives.txt file and returns it.
   */
  public static String randomPositiveAdj()
  {
    int index = (int)(Math.random() * posAdjectives.size());
    return posAdjectives.get(index);
  }



 //Yee Yee - a** code to find the sentimenatla value of an entire string grabbed from a .txt file.
 /* 
  * Notes: takes an int of i = 0 then a start value. Looks through the string letter by letter untill it finds a space. Then
  once it finds that space it stops, looks at the word it made (Using the start value set after each time we stop at a _)
  then finds sentimtal value of that. Rinse and repeat.
  */
  public static double totalSentiment(String fileName) {

    String currentReview = Review.textToString(fileName);
    
    int start = 0;
    double totalVal = 0;

    for(int i=0; i < currentReview.length(); i++) {

      if(currentReview.substring(i, i+1).equals(" ")) {

        String theWord = currentReview.substring(start, i);
        String theWordNO = Review.removePunctuation(theWord);
        
        totalVal += sentimentVal(theWordNO);
    
        start = i + 1;
      }

    }

    return totalVal;

  }

  public static int starRating(String fileName) {

    double tSent =Review.totalSentiment(fileName);

    if(tSent >= 5) {
      return 5;
    }
    else if(tSent >= 4) {
      return 4;
    }
    else if(tSent >= 3) {
      return 3;
    }
    else if(tSent >= 2) {
      return 2;
    }
    else if(tSent >=1) {
      return 1;
    }
    else {
      return 0;
    }
  }
  
  /** 
   * Randomly picks a negative adjective from the negativeAdjectives.txt file and returns it.
   */
  public static String randomNegativeAdj()
  {
    int index = (int)(Math.random() * negAdjectives.size());
    return negAdjectives.get(index);
    
  }
  
  /** 
   * Randomly picks a positive or negative adjective and returns it.
   */
  public static String randomAdjective()
  {
    boolean positive = Math.random() < .5;
    if(positive){
      return randomPositiveAdj();
    } else {
      return randomNegativeAdj();
    }
  }

  public static String fakeReview(String fileName) {


    String reviewToEdit = Review.textToString(fileName);

    int startIndex = reviewToEdit.indexOf("*");
    int endIndex = 0;


    for(int k = 0; k < reviewToEdit.length(); k++) {


     


      startIndex = reviewToEdit.indexOf("*");


    for(int i = startIndex; i < reviewToEdit.length()-1 && reviewToEdit.contains("*"); i++) {

      if(reviewToEdit.substring(i,i+1).equals(" ")) {
        endIndex = i;
        break;
      }
    }



    if(reviewToEdit.contains("*")) {
      reviewToEdit = reviewToEdit.substring(0,startIndex) + Review.randomAdjective() + reviewToEdit.substring(endIndex);
  }
  
   }

   return reviewToEdit;

  }













  
  public static String fakeOnlyReallyGood(String fileName) {

    

    String reviewToEdit = Review.textToString(fileName);

    int startIndex = reviewToEdit.indexOf("*");
    int endIndex = 0;
    double w = 0;
    String adj = "";


    for(int k = 0; k < reviewToEdit.length(); k++) {


     


      startIndex = reviewToEdit.indexOf("*");


    for(int i = startIndex; i < reviewToEdit.length()-1 && reviewToEdit.contains("*"); i++) {

      if(reviewToEdit.substring(i,i+1).equals(" ")) {
        endIndex = i;
        break;
      }
    }




    
    while(w < 1) {

      adj = Review.randomAdjective();
      w = Review.sentimentVal(adj);
    }


    if(reviewToEdit.contains("*")) {
      reviewToEdit = reviewToEdit.substring(0,startIndex) + adj + reviewToEdit.substring(endIndex);
      w = 0;
  }
  
   }

   return reviewToEdit;

  }




    
  }

