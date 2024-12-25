//3.2: Access Protected Members in the Same Package

package accessmodifier8;

//File:ProtectedBaseClass1 .java ,Package: accessmodifier8;)

public class AccessBaseClass {
 public static void main(String[] args) {
     
	 // Create an instance of ProtectedBaseClass1
     
	 ProtectedBaseClass1 pr1  = new ProtectedBaseClass1 ();

     // Access protected fields
     System.out.println("Name: " +pr1 .name);
     System.out.println("Age: " + pr1.age);

     // Call protected method
     pr1.printDetails();
 }
}
