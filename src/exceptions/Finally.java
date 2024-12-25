
//7. program with finally block


package exceptions;

public class Finally {
	    public static void main(String[] args) {
	    try {
	            int result = 10 / 0;  // This will cause an ArithmeticException
	        } 
	   catch (ArithmeticException e) {
	            System.out.println("An error occurred");
	        } 
	   finally {
	            System.out.println("This will always execute, whether an exception occurs or not.");
	        }
	    }
	}


