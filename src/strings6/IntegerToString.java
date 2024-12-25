//13. Converting integer objects to Strings

package strings6;

public class IntegerToString {
	    public static void main(String[] args) {
	        Integer number = 12345;  

	        String result = integerToString(number);

	        System.out.println("Converted Integer to String: " + result);
	    }

	    // Method to manually convert Integer to String
	    public static String integerToString(Integer number) {
	        if (number == 0) {
	            return "0";
	        }

	        boolean isNegative = number < 0;
	        if (isNegative) {
	            number = -number;  
	        }

	        StringBuilder sb = new StringBuilder();

	        while (number > 0) {
	            int digit = number % 10;  
	            sb.append((char) ('0' + digit));  
	            number /= 10;  
	        }

	        if (isNegative) {
	            sb.append('-');
	        }

	        sb.reverse();

	        return sb.toString();
	    }
	}


