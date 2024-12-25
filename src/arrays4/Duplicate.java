//10. Write a function to find the duplicate values of an array

package arrays4;

public class Duplicate{

	    public static void findDuplicates(int[] arr) {
	        boolean[] seen = new boolean[arr.length]; 

	        System.out.println("Duplicate values in the array:");
	        for (int i = 0; i < arr.length; i++) {
	            if (seen[i]) {
	                continue; 
	            }
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    System.out.println(arr[i]); 
	                    seen[j] = true; 
	                    break; 
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr = {12, 35, 1, 10, 34, 1, 35, 12};
	        
	        findDuplicates(arr);
	    }
	}


