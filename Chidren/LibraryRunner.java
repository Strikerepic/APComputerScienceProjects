
/*
 * Activity 3.7.5
 */
import java.util.ArrayList;
import java.util.Scanner;


public class LibraryRunner
{
  public static void main(String[] arg)
  {

    Library library = new Library();
    Scanner sc = new Scanner(System.in);


    System.out.println("Author:");
    String authorAsk = sc.nextLine();
    System.out.println("Title:");
    String titleAsk = sc.nextLine();


    for(Book x: library.getChildrensBooks() ) {
      if(x.getAuthor().contains(authorAsk)) {
        System.out.println(x.getTitle());
      } 
    }

    System.out.println("===============================================");
    double bookRating = 0;

    for(Book x: library.getChildrensBooks() ) {
      if(x.getTitle().contains(titleAsk)) {
        bookRating = x.getRating();
        System.out.println(bookRating);
      } 
    }

    for(Book x: library.getChildrensBooks() ) {
      if(x.getRating() > bookRating) {
       
        System.out.println(x.getTitle());
      } 
    }

    
    
  }
}