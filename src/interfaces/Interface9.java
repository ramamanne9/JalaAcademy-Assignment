//9.Create a PRIVATE or PROTECTED interface and print the values as above scenario

package interfaces;

public interface Parent {

	int NUM = 10;
    String GREETING = "Good Morning";

     default void displayMessage() {
     System.out.println(GREETING);
   }

    void displayNumber();
  }

  public class Child implements Parent {
  @Override
  public void displayNumber() {
     System.out.println("The number is: " + NUM);
   }
  }

  public class Interface9 {
  public static void main(String[] args) {
	  Child  cld = new Child ();

	  cld .displayMessage();  

	  cld .displayNumber();   
 }
 }