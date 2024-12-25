//7.Print the smaller and larger number

package operators2;

	import java.util.Scanner;
	public class GraterAndSmaller {


	    public static void main(String[] args) {
	        // Create Scanner object to take input from user
	        Scanner scanner = new Scanner(System.in);

	        // Prompt user to input two numbers
	        System.out.print("Enter the first number: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Enter the second number: ");
	        int num2 = scanner.nextInt();

	        // Check and print the smaller and larger number
	        if (num1 > num2) {
	            System.out.println("The larger number is: " + num1);
	            System.out.println("The smaller number is: " + num2);
	        } else if (num1 < num2) {
	            System.out.println("The larger number is: " + num2);
	            System.out.println("The smaller number is: " + num1);
	        } else {
	            System.out.println("Both numbers are equal.");
	        }

	        // Close the scanner object
	        scanner.close();
	    }
	}


