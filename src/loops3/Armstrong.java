//8.Write a program to find Armstrong number or not

package loops3;

	import java.util.Scanner;

	public class Armstrong {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        int originalNumber = number;

	        int numberOfDigits = 0;
	        while (number != 0) {
	            number /= 10; 
	            numberOfDigits++; 
	        }

	        number = originalNumber;

	        int sum = 0;
	        while (number != 0) {
	            int digit = number % 10; 
	            sum += Math.pow(digit, numberOfDigits); // Add the power of the digit to sum
	            number /= 10; 
	        }

	        if (sum == originalNumber) {
	            System.out.println(originalNumber + " is an Armstrong number.");
	        } else {
	            System.out.println(originalNumber + " is not an Armstrong number.");
	        }

	        scanner.close();
	    }
	}


