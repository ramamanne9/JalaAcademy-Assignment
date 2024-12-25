package arrays4;

public class Reverse2 {


	    public static void reverseArray(int[] arr) {
	        int start = 0;   
	        int end = arr.length - 1;  

	        while (start < end) { 
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;

	            start++;
	            end--;
	        }
	    }

	    public static void main(String[] args) {
	        int[] numbers = {1, 2, 3, 4, 5};  // Example array

	        reverseArray(numbers);

	        System.out.print("Reversed array: ");
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.print(numbers[i] + " ");
	        }
	    }
	}

