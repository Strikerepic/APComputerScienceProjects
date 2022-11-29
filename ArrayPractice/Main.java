package ArrayPractice;

public class Main {
    public static void main(String[] args) {

        int numList[] = {1,2,3,4,5,6,7,8,9,10,11};

        for(int index = numList.length-1; index >= 0; index--) {
            System.out.println(numList[index]);
        }
    }
}