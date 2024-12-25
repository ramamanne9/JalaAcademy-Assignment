
//9. Abstract Class

  package abstract9;

   abstract class AbstractClass {
    
   abstract void abstractMethod();
 
    void nonAbstractMethod() {
     System.out.println("This is a Non-Abstract Method");
     }
      }

  class NewClass extends AbstractClass {
 
  @Override
  void abstractMethod() {
     System.out.println("This is a AbstractMethod.");

  }
 
 
  void instanceAbstractMethod() {
	 NewClass obj = new NewClass();
     
     obj.abstractMethod(); 
  }
 
   void instanceNonAbstractMethod() {
	 NewClass obj = new NewClass();
     
     obj.nonAbstractMethod();  
 }
 }

  public class Main {
  public static void main(String[] args) {
	 NewClass cobj = new NewClass();

     cobj. instanceAbstractMethod();
     cobj. instanceNonAbstractMethod();
   }
   }

