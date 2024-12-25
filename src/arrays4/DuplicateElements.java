//18. Write a program to remove the duplicate elements and return the new array

package arrays4;
import java.util.Arrays;

public class DuplicateElements {

	public static int[] removeDuplicates(int[] arr) {
	        int[] temp = new int[arr.length];
	        int tempIndex = 0;

	        for (int i = 0; i < arr.length; i++) {
	            boolean isDuplicate = false;

	            for (int j = 0; j < tempIndex; j++) {
	                if (arr[i] == temp[j]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }

	            if (!isDuplicate) {
	                temp[tempIndex++] = arr[i];
	            }
	        }

	        int[] result = new int[tempIndex];
	        for (int i = 0; i < tempIndex; i++) {
	            result[i] = temp[i];
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        int[] arr = {12, 35, 1, 10, 34, 1, 35, 12};  
	        int[] result = removeDuplicates(arr);  

	        System.out.print("Array without duplicates: ");
	        for (int num : result) {
	            System.out.print(num + " ");
	        }
	    }
	}

