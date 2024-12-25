// 5. Programs on Logical AND,OR operator and Logical NOT

package operators2;

public class Logical {
	public class LogicalOperators {

	    public static void main(String[] args) {
	        boolean a = false;
	        boolean b = false;
	        boolean c = true;

	        if (a && c) {
	            System.out.println("Both a and c are true.");
	        } else {
	            System.out.println("Either a or c is false.");
	        }

	        if (a || b) {
	            System.out.println("At least one of a or b is true.");
	        } else {
	            System.out.println("Both a and b are false.");
	        }

	        if (!b) {
	            System.out.println("b is false.");
	        }
	    }
	}

}
