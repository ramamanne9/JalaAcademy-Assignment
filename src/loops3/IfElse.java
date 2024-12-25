//13.Program for multiple if else statement(Largest number in 10,20 and 30)

package loops3;

public class IfElse {
	public class LargestNumber {

	    public static void main(String[] args) {
	       
	    	int num1 = 10, num2 = 20, num3 = 30;

	        if (num1 >= num2 && num1 >= num3) {
	            System.out.println(num1 + " is the largest number.");
	        } else if (num2 >= num1 && num2 >= num3) {
	            System.out.println(num2 + " is the largest number.");
	        } else {
	            System.out.println(num3 + " is the largest number.");
	        }
	    }
	}

}
