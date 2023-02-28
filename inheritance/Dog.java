import javafx.scene.control.Button;

public class Dog extends Pets {

    boolean butterOnHead = false;

    public boolean hasButter() {
        return butterOnHead;
    }
    
    public void placeButterOnHead(boolean daButter) {
        butterOnHead = daButter;
    }
    
}
