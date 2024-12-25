//Write a function to test if array contains a specific value
package arrays4;

public class Contains {

     public static boolean containsValue(int[] arr, int target) 
     {
	        for (int i = 0; i < 1000; i++) {  
	            if (arr[i] == target) {
	                return true;  
	            }
	        }
	        return false;  
	    }

	    public static void main(String[] args) {
	        
	        int[] numbers = {10, 20, 30, 40, 50};  
	        int target = 30;  

	       
	        if (containsValue(numbers, target)) {
	            System.out.println("Array contains " + target);
	        } 
	        else {
	            System.out.println("Array does not contain " + target);
	        }
	    }
}
