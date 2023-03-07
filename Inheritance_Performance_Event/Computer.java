
public class Computer {

    private int age = 0;
    private boolean canTurnOn = false;

    
    Computer(int age, boolean canTurnOn) {
        this.age = age;
        this.canTurnOn = canTurnOn;

    }

    public int getAge() {
        return age;
    }
    public void setAge(int a) {
        age = a;
    }

    public boolean getCanTurnOn() {
        return canTurnOn;
    }

    public void setCanTurnOn(boolean a) {
        canTurnOn = a;
    }
    
}
