//5. Write a function to remove a specific element from an array

package arrays4;

public class Remove {

	    public static int[] removeElement(int[] arr, int target) {
	        int count = 0;

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] != target) {
	                count++;
	            }
	        }

	        int[] result = new int[count];
	        int index = 0;

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] != target) {
	                result[index] = arr[i];
	                index++;
	            }
	        }

	        return result; 
	    }

	    public static void main(String[] args) {
	        
	        int[] numbers = {10, 20, 30, 40, 50};  
	        int target = 30; 

	        int[] newArray = removeElement(numbers, target);

	        System.out.print("Array after removal: ");
	        for (int i = 0; i < newArray.length; i++) {
	            System.out.print(newArray[i] + " ");
	        }
	    }
	}


