//6write a program to create your own exception

package exceptions;

class MyException extends Exception {
 public MyException(String s) {
     super(s); 
 }
}

public class Exception1 {
 public static void main(String args[]) {
     try {
         throw new MyException("This is a custom error message!");
     }
     catch (MyException e) {
         
    	 System.out.println("Caught custom exception!");

         System.out.println("Exception details: " + e);
     } 
 }
}
