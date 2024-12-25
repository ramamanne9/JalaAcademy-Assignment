// 6. Program for relational operators (<,<==, >, >==)

package operators2;

	public class RelationalOperators {

	    public static void main(String[] args) {
	        int num1 = 10;
	        int num2 = 20;

	        // Using the less than (<) operator
	        if (num1 < num2) {
	            System.out.println(num1 + " is less than " + num2);
	        } else {
	            System.out.println(num1 + " is not less than " + num2);
	        }

	        // Using the less than or equal to (<=) operator
	        if (num1 <= num2) {
	            System.out.println(num1 + " is less than or equal to " + num2);
	        } else {
	            System.out.println(num1 + " is not less than or equal to " + num2);
	        }

	        // Using the greater than (>) operator
	        if (num1 > num2) {
	            System.out.println(num1 + " is greater than " + num2);
	        } else {
	            System.out.println(num1 + " is not greater than " + num2);
	        }

	        // Using the greater than or equal to (>=) operator
	        if (num1 >= num2) {
	            System.out.println(num1 + " is greater than or equal to " + num2);
	        } else {
	            System.out.println(num1 + " is not greater than or equal to " + num2);
	        }
	    }
	}


