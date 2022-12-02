package ArrayPractice;



public class StandardArrayAlgorithms 
{
  public static void main(String[] args)
  {
    int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};
    
    double sum = 0;
    double avg = 0;
    double max = 0;
    for (int i = 0; i < goals.length; i++) {
      sum += goals[i];

      avg = sum/(goals.length);


      if(goals[i] > max) {
        max = goals[i];
      }
    }

    

    



    
    System.out.println("All goals: " + sum);
    System.out.println("AVG GOALS: " + avg);
    System.out.println("MAX:" + max);
  }
  
}
