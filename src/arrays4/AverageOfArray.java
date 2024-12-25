
//2. Write a function to calculate the average value of an array of integers

package arrays4;

public class AverageOfArray {

	    public static double calculateAverage(int[] arr) {
	        int sum = 0;  
	        int count = 0; 

	        for (int i = 0; i < arr.length; i++) {
	            sum += arr[i];  
	            count++;  
	        }

	        if (count == 0) {
	            return 0;  
	        } else {
	            return (double) sum / count;  
	        }
	    }

	    public static void main(String[] args) {
	        
	        int[] numbers = {1, 2, 3, 4, 5};  
	        double result = calculateAverage(numbers);  
	        System.out.println("Average of array elements: " + result);  
	    }
	}


