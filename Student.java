import java.util.*;
public class Student{
 
  //attribute fields

private String Name;
private int Age;
private static int count = 0;

  

   //behaviors

public void setRecord(String n, int a)
{
  this.Name = n;
  this.Age = a;
}

public void displayRecord()
{
    System.out.println("Student name is " + this.Name + " has age = " + this.Age);
}

public static void main(String[] args) {
  Student S1 = new Student();
  Student S2 = new Student();


S1.setRecord("Ashley", 34);
S2.setRecord("Ainee", 40);

S1.displayRecord();
S2.displayRecord();

}
}

