//8. Write a function to find the minimum and maximum value of an array
package arrays4;

public class MinMax {


	    public static void findMinMax(int[] arr) {
	        int min = arr[0];
	        int max = arr[0];

	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < min) {
	                min = arr[i];  
	            }
	            if (arr[i] > max) {
	                max = arr[i];  
	            }
	        }

	        System.out.println("Minimum value: " + min);
	        System.out.println("Maximum value: " + max);
	    }

	    public static void main(String[] args) {
	        int[] numbers = {10, 20, 5, 40, 50, 3};  

	        findMinMax(numbers);
	    }
	}

