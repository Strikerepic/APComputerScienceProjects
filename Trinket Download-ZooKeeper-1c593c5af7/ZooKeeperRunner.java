import java.nio.channels.AlreadyConnectedException;
import java.util.ArrayList;

/*
 * Activity 4.9.2
 */
public class ZooKeeperRunner
{
  public static void main(String[] args)
  { 
       
    Animal elephant = new Elephant("leaves, grasses, roots", false, 60.0);

    Animal gorilla = new Gorilla("Food", false, 885);

    Animal tiger = new Tiger("meat", true, 17.0);

    Animal a = new Elephant("leaves, grasses, roots", false, 60.0);


    a.isNocturnal();
    // a.trumpet();  An object can invoke methods going up to its superclass but going up it wont be able to see up and over the stairs.





    Object o = new Object();
System.out.println(o.toString());
Elephant e = new Elephant("leaves, grasses, roots", false, 60.0);
System.out.println(e.toString());


Animal a3 = new Animal("leaves, grasses, roots", false, 60.0);
System.out.println(a3.toString());



Animal a4 = new Elephant("leaves, grasses, roots", false, 60.0);
System.out.println(a4.toString());









  }
}