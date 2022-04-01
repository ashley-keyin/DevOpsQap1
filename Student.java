import java.util.*;
public class Student{
 
  //attribute fields

private String Name;
private int Age;
private String email;
private String address;
private static int count = 0;

  

   //behaviors

public void setRecord(String n, int a, String email, String address )
{
  this.Name = n;
  this.Age = a;
  this.email = email;
  this.address = address;
}

public String getEmail() {
  return email;
}

public String getAddress() {
  return address;
}

public void displayRecord()
{
    System.out.println("\n" + "Student name:" + this.Name + "\n" + "Age: " + this.Age + "\n" + "Email: " + this.email + "\n" + "Address: " + this.address);
}
}

