public class IMac extends Desktop {
    private double expensiveness = 0;

    public IMac(double expensiveness) {
        super("macOS");
        this.expensiveness = expensiveness;
        super.setAge(3);
    }

    public void damage() {
        expensiveness = expensiveness * 0.5;
    }

    public void upgrade() {
        expensiveness = expensiveness * 2;    //funny because you cant do this on macs.
        super.setAge((super.getAge()-1));
        
    }
    
    public double getExpensiveness() {
        return expensiveness;
    }
}
