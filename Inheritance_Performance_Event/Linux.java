public class Linux extends Computer {
    private int activeUsers = 0;
    private String machineName = "";
    public Linux() {
        super(5000,false );
        activeUsers++;
    }

    public int getActiveUsers() {
        return activeUsers;
    }

    public void changeName(String a) {
        machineName = a;
    }

    public void corruptName() {
        machineName = machineName + "kasdfjaklsjdf;kjasf;kjawe;f";
    }
    
}
