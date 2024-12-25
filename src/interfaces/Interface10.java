//10. Create an interface with private, public and protected fields.
////Define the interface with public, private, and protected fields 


package interfaces;

//Define the interface with public, private, and protected methods (fields are always public)
public interface MyInterface {
 
	
  // Public constant fields 
   int NUM = 10;
   String GREETING = " welcome to the interface!";

  // Public method 
  void publicMethod();

 // Protected method 
  protected void protectedMethod();

 // Private method 
 private void privateMethod() {
     System.out.println("This is a private method in the interface.");
 }
}

//Implementing the interface 

class MyClass implements MyInterface {
 @Override
 public void publicMethod() {
      
 System.out.println("Implemented publicMethod.");
 }

 @Override
 public void protectedMethod() {
     System.out.println("Implemented protectedMethod.");
 }

 //  privateMethod() cannot be accessed in the implementing class.
}

public class Interface10 {
 public static void main(String[] args) {
      
	 MyClass obj = new MyClass();

     
     System.out.println("NUM: " + MyInterface.NUM); 
     System.out.println("GREETING: " + MyInterface.GREETING);

     obj.publicMethod();    
     obj.protectedMethod(); 
 }
}
