//4. program to print the odd and even numbers

package loops3;

public class EvenOrOdd {

	    public static void main(String[] args) {
	     System.out.println("Even numbers from 1 to 20:");
	        for (int i = 1; i <= 20; i++) {
	            if (i % 2 == 0) {
	                System.out.println(i); 
	            }
	        }

	       
	        System.out.println("\nOdd numbers from 1 to 20:");
	        for (int i = 1; i <= 20; i++) {
	            if (i % 2 != 0) {
	                System.out.println(i); 
	            }
	        }
	    }
	}


