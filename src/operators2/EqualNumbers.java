package operators2;
	import java.util.Scanner;


	public class EqualNumbers {

	 public static void main(String[] args) {
	      
		 int num1 , num2;
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first number: ");
	        num1 = scanner.nextInt();

	        System.out.print("Enter the second number: ");
	         num2 = scanner.nextInt();

	        if (num1 == num2) {
	            System.out.println("The two numbers are equal");
	        } else {
	            System.out.println("The two numbers are not equal");
	        }

	        scanner.close();
	    }
	}


