public class Tiger extends Feline {
    
    public Tiger(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
    }

    public void huntAlone() {
        System.out.println("The tiger hunted alone");
    }

    public void swim() {
        System.out.println("The tiger swam");
    }

    public void speak() {
        roar();
    }

    public void roar() {
        System.out.print("ROOOARRAOOAR");
    }



    
}
