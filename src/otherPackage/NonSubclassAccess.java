
// 4 Try to Access Protected Members from a Non-Subclass in a Different Package

package otherPackage;
import accessmodifier8.ProtectedBaseClass1;

     public class NonSubclassAccess {
    
    	 public static void main(String[] args) {
     
    	 // Create an instance of ProtectedBaseClass1
	 ProtectedBaseClass1 baseObj = new ProtectedBaseClass1();

     // Try to access protected fields, call protected method will cause a compile-time error 

 }
}

