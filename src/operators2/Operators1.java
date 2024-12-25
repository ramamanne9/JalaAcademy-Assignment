// arithmetic operators(+,-,*,/)

package operators2;
 public class Operators1 {

	public class ArithmeticOperations {

	    public static double add(double a, double b) {
	        return a + b;
	    }

	    public static double subtract(double a, double b) {
	        return a - b;
	    }

	    public static double multiply(double a, double b) {
	        return a * b;
	    }

	    public static double divide(double a, double b) {
	        return a / b;
	    }

	    public static double performOperation(double a, double b, char operator) {
	        switch (operator) {
	            case '+': return add(a, b);
	            case '-': return subtract(a, b);
	            case '*': return multiply(a, b);
	            case '/': return divide(a, b);
	            default: 
	                System.out.println("Invalid operator");
	                return Double.NaN; 
	        }
	    }

	    public static void main(String[] args) {
	        double num1 = 10;
	        double num2 = 5;

	        double resultAdd = performOperation(num1, num2, '+');
	        System.out.println("Result of addition: " + resultAdd);

	        double resultSub = performOperation(num1, num2, '-');
	        System.out.println("Result of subtraction: " + resultSub);

	        double resultMul = performOperation(num1, num2, '*');
	        System.out.println("Result of multiplication: " + resultMul);

	        double resultDiv = performOperation(num1, num2, '/');
	        System.out.println("Result of division: " + resultDiv);
	    }
	}
}
