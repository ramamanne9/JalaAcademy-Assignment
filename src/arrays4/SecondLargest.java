//13. Write a method to find the second largest number in an array

package arrays4;

public class SecondLargest {


	    public static int findSecondLargest(int[] arr) {
	        if (arr.length < 2) {
	            System.out.println("Array must have at least two elements");
	            return -1;  	        }

	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] > largest) {
	                secondLargest = largest;  
	                largest = arr[i];  
	            } else if (arr[i] > secondLargest && arr[i] != largest) {
	                secondLargest = arr[i];  
	            }
	        }

	        if (secondLargest == Integer.MIN_VALUE) {
	            System.out.println("No second largest element found.");
	            return -1;
	        }

	        return secondLargest;  
	    }

	    public static void main(String[] args) {
	        int[] numbers = {10, 20, 4, 30, 50};  

	        int result = findSecondLargest(numbers);

	        if (result != -1) {
	            System.out.println("Second largest number is: " + result);
	        }
	    }
	}

