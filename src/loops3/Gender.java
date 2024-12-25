
//12.Print gender (Male/Female) program according to given M/F using switch

package loops3;

	import java.util.Scanner;

	public class Gender {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter gender (M/F): ");
	        char gender = scanner.next().charAt(0); // Read the first character

	        switch (gender) {
	            case 'M':
	            case 'm':
	                System.out.println("Male");
	                break;
	            case 'F':
	            case 'f':
	                System.out.println("Female");
	                break;
	            default:
	                System.out.println("Invalid input. Please enter M for Male or F for Female.");
	                break;
	        }

	        scanner.close();
	    }
	}


