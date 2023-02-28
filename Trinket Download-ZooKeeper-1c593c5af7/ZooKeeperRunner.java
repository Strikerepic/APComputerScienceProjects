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


   ArrayList<Animal> daAnimals = new ArrayList<Animal> ();

   daAnimals.add(elephant);
   daAnimals.add(gorilla);
   daAnimals.add(tiger);


   for(Animal animal : daAnimals) {
    animal.hearTheAnimal(animal);
   }








  }
}