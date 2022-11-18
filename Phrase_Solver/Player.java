package Phrase_Solver;
import java.util.Scanner;

public class Player {
    private String name;
    public void setName(int playerNumber) {
        Scanner sc = new Scanner(System.in);
        System.out.println("IDENTIFY YOURSELF PLAYER " + playerNumber);
        name = sc.nextLine();
    }
    public String getName() {
        return name;
    }
}
