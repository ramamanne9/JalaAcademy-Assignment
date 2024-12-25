
//Step 3: Access Protected Members in a Subclass from a Different Package


//this is subclass for protectedbaseclass1 in accessmodifier8 package
package otherPackage;
import accessmodifier8.ProtectedBaseClass1;   


  public class SubClass extends ProtectedBaseClass1 {
  
	  public static void main(String[] args) {
     // Create an instance of SubClass
     
		  SubClass subObj = new SubClass();

     System.out.println("Name from SubClass: " + subObj.name);
     System.out.println("Age from SubClass: " + subObj.age);

     subObj.printDetails();
 }
}

