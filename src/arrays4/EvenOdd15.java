//15. Write a method to find number of even number and odd numbers in an array

package arrays4;

public class EvenOdd15 {


	    public static void countEvenOdd(int[] arr) {
	        int evenCount = 0;
	        int oddCount = 0;

	        for (int num : arr) {
	            if (num % 2 == 0) {
	                evenCount++; 
	            } else {
	                oddCount++;
	            }
	        }

	        System.out.println("Number of even numbers: " + evenCount);
	        System.out.println("Number of odd numbers: " + oddCount);
	    }

	    public static void main(String[] args) {
	        int[] arr = {12, 35, 1, 10, 34, 1, 25, 8};
	        countEvenOdd(arr); 
	    }
	}

