
public class Elephant extends Animal {
    public void trumpet() {
        System.out.println("TOOOOT");
        }


        public void forage() {
            System.out.println("THIS ANIMAL HAS FORAGED FOR SOME FOOD");
        }



        public Elephant(String food, boolean nocturnal, double aveLifeSpan)
        {
                super(food, nocturnal, aveLifeSpan);
            }

            public void speak() {
                trumpet();
              }

              
              public String toString()
              {
                return "This is an object of the Elephant class.";
              }
}
