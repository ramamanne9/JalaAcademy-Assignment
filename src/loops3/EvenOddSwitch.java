
//Program to check whether a number is EVEN or ODD using switch


package loops3;

	import java.util.Scanner;
	public class EvenOddSwitch {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();

	        switch (num % 2) {
	            case 0:
	                System.out.println(num + " is an even number.");
	                break;
	            case 1:
	                System.out.println(num + " is an odd number.");
	                break;
	            default:
	                System.out.println("Invalid input.");
	                break;
	        }

	        scanner.close();
	    }
	}


