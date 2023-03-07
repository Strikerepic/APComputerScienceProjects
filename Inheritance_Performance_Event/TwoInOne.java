public class TwoInOne extends Laptop {

    private boolean keyBoardOn = false;

    public TwoInOne() {
        super(13,0);
        keyBoardOn = true;
    }

    public void removeKeyboard() {
        keyBoardOn = false;
        super.isClosed = false;
    }

    public void putOnKeyboard() {
        keyBoardOn = true;
        super.isClosed = false;
    }

    public boolean getKeyboardState() {
        return keyBoardOn;
    }


    public void touchTouchScreen() {
        System.out.println("You touched it");
    }


    
}
