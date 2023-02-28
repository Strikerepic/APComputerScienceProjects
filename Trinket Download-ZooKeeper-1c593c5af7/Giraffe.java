/*
 * Activity 4.9.2
 */
public class Giraffe extends Hooved
{
  public void hum()
  {
    System.out.println("The giraffe hums.");
  }

  public Giraffe(String food, boolean nocturnal, double aveLifeSpan) {
    super(food, nocturnal, aveLifeSpan);
}


  public void speak() {
    hum();
  }
}