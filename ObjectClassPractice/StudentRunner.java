/*
 * Activity 4.9.7
 */ 
public class StudentRunner
{ 
  public static void main(String args[]) 
  { 
    Student s = new Student("TestName",1,2); 
    Student t = new Student("Testname",1,3);
    Student r = new Student("New Name",2,2);
    Student sam = new Student("Sam", 18,3);

    // Below two statements are equivalent 


    System.out.println(s.toString());
    System.out.println(sam.toString());
    System.out.println(r.equals(sam));



  } 
} 