//Encapsulation

package Samplefirst;

class Employee {

 private int empid;
 private String ename;

 public void set_id(int empid) { 
     this.empid = empid; 
 }

 public void set_name(String ename) {
     this.ename = ename;
 }

 public int get_id() { 
     return empid; 
 }

 public String get_name() { 
     return ename; 
 }
}

public class Newsample {
 public static void main(String args[]) {
     Employee e = new Employee(); 
     e.set_id(78);
     e.set_name("udhaya");
     System.out.println("Employee ID: " + e.get_id());
     System.out.println("Employee Name: " + e.get_name());
 }
}
