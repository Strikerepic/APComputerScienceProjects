public class Laptop extends Computer {
    int size = 0;

    boolean isClosed = true;

    public Laptop(int size, int age) {
        super(age, true);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int a) {
        size = a;
    }

    public void closeLaptop() {
        isClosed = true;
    }

    public void openLaptop() {
        isClosed = false;
    }

    public boolean getClosedState() {
        return isClosed;
    }


}
