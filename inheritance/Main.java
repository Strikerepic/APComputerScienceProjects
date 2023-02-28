public class Main{


    public static void main(String args[]) {

        Dog perro = new Dog();
        Cat gatto = new Cat();
        Pets object = new Pets();

        System.out.println(perro.getName());
        perro.setName("Buuta Dog");
        System.out.println(perro.getName());
        System.out.println(perro.hasButter());
        perro.placeButterOnHead(true);
        System.out.println(perro.hasButter());

        gatto.setAge(88);
        System.out.println(gatto.isMilkEnjoyer());

        object.setIsScary(true);
            //   object.isMilkEnjoyer();  // Doesn't work.











    }

}