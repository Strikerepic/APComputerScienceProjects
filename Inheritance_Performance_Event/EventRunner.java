public class EventRunner {

    public static void main(String args[]) {

        IMac thing = new IMac(5000);
        System.out.println(thing.getExpensiveness());
        thing.damage();
        System.out.println(thing.getExpensiveness());
        System.out.println(thing.getAge());
        thing.upgrade();
        System.out.println(thing.getAge());



        TwoInOne dell = new TwoInOne();
       System.out.println(dell.getKeyboardState());
       dell.removeKeyboard();
       System.out.println(dell.getKeyboardState());
       System.out.println(dell.getClosedState());



       GamingPC NZXT = new GamingPC(9000);
       System.out.println(NZXT.getosType());



    }
}