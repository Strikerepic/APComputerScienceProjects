/*
 * Activity 4.9.7
 */ 
public class Student 
{ 
  private String name = "";  
  private int age = 0;
  private int id = 0;

  // Constructor 
  Student(String inputName, int age, int id) 
  { 
    name = inputName;
    this.age = age;
    this.id = id;
  }
  
  public int getAge() {
    return age;
  }

  public String toString() {
    return "This student's name is " + name + " and is " + age + " years old";
  }





  public boolean equals(Student name) {
    if(name.getId() == this.id) {
      return true;
    } 
    else {
      return false;
    }



  }






  public int getId() {
    return id;
  }

} 