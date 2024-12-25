

//3. Write a program to find the index of an array element

package arrays4;

public class ArrayIndex {

	    public static int findIndex(int[] arr, int target) {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == target) {
	                return i;
	            }
	        }
	        return -1;
	    }

	    public static void main(String[] args) {
	        int[] numbers = {10, 20, 30, 40, 50};  
	        int target = 30;  

	        int index = findIndex(numbers, target);  

	      
	        if (index != -1) {
	            System.out.println("Element " + target + " found at index: " + index);
	        } else {
	            System.out.println("Element " + target + " not found in the array.");
	        }
	    }}
	


