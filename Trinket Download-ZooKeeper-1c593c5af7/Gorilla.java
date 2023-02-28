/*
 * Activity 4.9.2
 */
public class Gorilla extends Primate
{
  public void grunt()
  {
    System.out.println("The gorilla grunts.");
  }

  

public void speak() {
 grunt();
}


public Gorilla(String food, boolean nocturnal, double aveLifeSpan)
        {
          super(food, nocturnal, aveLifeSpan);
          System.out.println("Heyo the gorrila here");
                
            }


}