package Horses;
import java.util.ArrayList;


public class RandomPermRunner
{
  public static void main(String[] args)
  {
    int[] randNums = RandomPermutation.next(10);
    
    ArrayList<String> horsesArray = new ArrayList<String>();
     
    System.out.println(java.util.Arrays.toString(randNums));


    

    String horseNames[] = {"null", "Horse1","Horse2","Horse3","Horse4","Horse5","Horse6","Horse7","Horse8","Horse9","Horse10"};


    for(int i = 0; i < 10; i++) {

        int hold = randNums[i];

        System.out.println(horseNames[hold]);


        horsesArray.add(horseNames[hold]);




    }


    System.out.println(horsesArray);



    for(int i = 0; i<10; i = i+2) {

      try {
        System.out.println("Ladies and Gentlemen, " + horsesArray.get(i) + " and " + horsesArray.get(i +1) + "  are partners!!!" );
      } catch (Exception e) {
        System.out.println(horsesArray.get(i) + " is alone" );
      }
        
    }




        
        

        
    

  }
}
