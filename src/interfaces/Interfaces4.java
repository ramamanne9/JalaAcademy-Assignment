
/*4 Create two interfaces with one method each. Implement these two interfaces in one
class*/

package interfaces;

//Define an interface with an abstract method
interface MyInterface {
 void implemented();  // Abstract method to be implemented by any class that implements the interface
}

//Class implementing the interface
class MyClass implements MyInterface {
 @Override
 public void implemented() {
     System.out.println("Method implemented in MyClass.");
 }
}

public class Interface3 {
 public static void main(String[] args) {
     MyInterface obj = new MyClass();  // Creating an instance of MyClass to call the method

     // Calling the implemented method using the interface reference
     obj.implemented();  // This calls the implemented method in MyClass
 }
}
