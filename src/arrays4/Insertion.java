//7. Write a function to insert an element at a specific position in the array

package arrays4;

public class Insertion {

	    public static int[] insertElement(int[] arr, int element, int position) {
	        int[] newArray = new int[arr.length + 1];

	        for (int i = 0; i < position; i++) {
	            newArray[i] = arr[i];
	        }

	        newArray[position] = element;

	        for (int i = position; i < arr.length; i++) {
	            newArray[i + 1] = arr[i];
	        }

	        return newArray;
	    }

	    public static void main(String[] args) {
	    int[] originalArray = {10, 20, 30, 40, 50};  
	        int element = 25;  
	        int position = 2;  

	    int[] newArray = insertElement(originalArray, element, position);

	        
	        System.out.print("Array after insertion: ");
	        for (int i = 0; i < newArray.length; i++) 
	        {
	            System.out.print(newArray[i] + " ");
	        }
	    }
	}


