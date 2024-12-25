/* 3.1Create a class with PROTECTED fields and methods. Access these fields and methods
from any other class in the same package.*/

package accessmodifier8;


   public class ProtectedBaseClass1 {
   
   // Protected fields and method
  
   protected String name = "riya";
   protected int age = 25;

   // Protected method
    
   protected void printDetails() {
     System.out.println("Name: " + name + ", Age: " + age);
  }
  }

