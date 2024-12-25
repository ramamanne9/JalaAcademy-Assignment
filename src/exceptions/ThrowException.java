
//3.  program to method which throws exception, Call that method in main class without try block
package exceptions;

public class ThrowException {
	    
public static void generateException() throws ArithmeticException {
	        int number1= 10;
	        int number2 = 0;  
	        int result = number1/ number2;  
	        System.out.println("Result: " + result); 
	    }

	    public static void main(String[] args) {
	        generateException();  
	    }
	}
	

