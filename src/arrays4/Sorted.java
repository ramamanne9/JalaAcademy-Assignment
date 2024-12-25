//19. Write a function to find the missing number of sorted array of 1 to 100

package arrays4;

public class Sorted {

	    public static int findMissingNumber(int[] arr) {
	        int n = 100;  

	        int expectedSum = (n * (n + 1)) / 2;

	        int actualSum = 0;
	        for (int num : arr) {
	            actualSum += num;
	        }

	        return expectedSum - actualSum;
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, /* ... */ 54, 56, 57, 58, 59, 60, /* ... */ 100};
	        
	        int missingNumber = findMissingNumber(arr);
	        System.out.println("The missing number is: " + missingNumber);
	    }
	}


