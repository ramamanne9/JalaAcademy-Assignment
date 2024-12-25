package arrays4;

//17. Write a method to verify if the array contains two specified elements(12,23)

public class Test17{

	    public static boolean containsBothElements(int[] arr, int num1, int num2) {
	        boolean foundNum1 = false;
	        boolean foundNum2 = false;

	        for (int num : arr) {
	            if (num == num1) {
	                foundNum1 = true; 
	            }
	            if (num == num2) {
	                foundNum2 = true; 
	        }}

	        return foundNum1 && foundNum2;
	    }

	    public static void main(String[] args) {
	        int[] arr = {12, 35, 1, 23, 34};  	        boolean result = containsBothElements(arr, 12, 23);  // Check for 12 and 23
	        if (result) {
	            System.out.println("The array contains both 12 and 23.");
	        } else {
	            System.out.println("The array does not contain both 12 and 23.");
	        }
	    }
	}


