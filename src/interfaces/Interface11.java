//11. Create an interface with static final variable

package interfaces;


  public interface Interface11 {
  int CONSTANT_NUMBER = 100;  
  String GREETING = "Hello from the interface!";  
 }

 class MyClass implements Interface11 {
 
	public void displayConstant() {
     System.out.println("Constant number: " + CONSTANT_NUMBER);
     System.out.println("Greeting: " + GREETING);
 }
}

   public class Interface11Test {
   public static void main(String[] args) {
     MyClass obj = new MyClass(); 

     obj.displayConstant();  
 }
 }
