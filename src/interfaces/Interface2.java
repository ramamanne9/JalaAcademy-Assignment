/*2. Create an interface with two methods, but implement only one in a class. Call the
method implemented.*/

package interfaces;

// interface with two methods
   interface MyInterface1 {
   void implemented();  
   void notImplemented();  
   }

//Abstract class implementing the interface

   abstract class MyClass implements MyInterface1 {
 
	@Override
  public void implemented() {
     System.out.println("Method implemented in MyClass.");
  }

  }

   public class Interface2 {
   public static void main(String[] args) {
     MyInterface1 obj = new MyClass() {
         @Override
         public void notImplemented() {
             System.out.println("Method implemented in anonymous class.");
         }
     };

     obj.implemented();  

     obj.notImplemented();  
 }
}

