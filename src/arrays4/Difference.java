 //16. Write a function to get the difference of largest and smallest value

package arrays4;

public class Difference {


	    public static int getDifference(int[] arr) {
	        if (arr == null || arr.length == 0) {
	            throw new IllegalArgumentException("Array must not be empty");
	        }

	        int largest = arr[0];  
	        int smallest = arr[0]; 

	        for (int num : arr) {
	            if (num > largest) {
	                largest = num; 
	            }
	            if (num < smallest) {
	                smallest = num; 
	            }
	        }

	        return largest - smallest;
	    }

	    public static void main(String[] args) {
	        int[] arr = {12, 35, 1, 10, 34, 1};
	        System.out.println("The difference between two numbers: " + getDifference(arr));
	    }
	}
