/*Create a PUBLIC interface with fields and methods, fields should have values assigned.
Implement this interface to some class and print the values of the interface fields and
call the interface methods */

package interfaces;

public interface MyInterface {
 int NUM = 10;  // Constant number
 String GREETING = "Good Morning";  // Constant greeting message

 void displayMessage();
 void displayNumber();
}

class MyClass implements MyInterface {
 @Override
 public void displayMessage() {
     System.out.println(GREETING);  // Print the greeting message
 }

 @Override
 public void displayNumber() {
     System.out.println("The number is: " + NUM);  // Print the constant number
 }
}

public class Interface8 {
 public static void main(String[] args) {
     MyClass obj = new MyClass();

     obj.displayMessage();  
     obj.displayNumber();   
 }
}
