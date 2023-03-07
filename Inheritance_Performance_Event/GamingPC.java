public class GamingPC extends Desktop {
    int power = 0;

    public GamingPC(int power) {
        super("Windows");
        this.power = power;
    }

    public void setPower(int a ) {
        power = a;
    }

    public int getPower() {
        return power;
    }
    
    
}
