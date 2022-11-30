package ArrayPractice;

public class Main {
    public static void main(String[] args) {

        int numList1[] = {1,2,3,4,5,6,7,8,9,10};

        int numList2[] = {11,12,13,14,15,16,17,18,19,20};

        int numList3[] = {21,22,23,24,25,26,27,28,29,30};

        for(int index = numList1.length-1; index >= 0; index--) {   // -1 needed beacuse array is always one less then we think it will be.
            System.out.println(numList1[index]);
        }

        System.out.println("===============ARRAY 2===============");

        for(int index = 0; index < numList2.length; index++) {

            numList2[index] = numList2[index] - 1;
            System.out.println(numList2[index]);
        }

        System.out.println("===============ARRAY 3===============");

        for(double x: numList3) {

            System.out.println(x * 0.5);      //DOESNT CHANGE THE ARRAY VALUE JUST DOES A TEMP CHANGE FOR OUTPUT ON THE TERMINAL!!!!!!!!!!!

        }



    }
}