
/* 5. Create two interfaces with the same method (same signature) in both the interfaces.
Implement these two interfaces in one class. Call the method.*/

package interfaces;

//Two interfaces with the same method signature
 
  interface InterfaceOne {
  void commonMethod();  
 }

  interface InterfaceTwo {
  void commonMethod();  
 }

 //Implementing both interfaces in one class
  class MyClass implements InterfaceOne, InterfaceTwo {

 // Implementing the common method only once for both interfaces
 @Override
 public void commonMethod() {
     System.out.println("commonMethod implemented in MyClass.");
  }
 }

 public class Interface5 {
 public static void main(String[] args) {
     MyClass obj = new MyClass();  // Creating an instance of MyClass
     obj.commonMethod();  // Calling the common method
 }
}
