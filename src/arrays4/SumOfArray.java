
//1. Write a function to add integer values of an array


package arrays4;

public class SumOfArray {

	    public static int sumArray(int[] arr)
	    {
	        int sum = 0; 
	        for (int i = 0; i < arr.length; i++) {
	            sum += arr[i]; 
	        }
	        return sum; 
	    }

	    public static void main(String[] args) {
	        int[] numbers = {7,2,5,3,10}; 
	        int result = sumArray(numbers); 
	        System.out.println("Sum of array elements: " + result); 
	    }
	}
	
