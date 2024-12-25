//6. Write a function to copy an array to another array

package arrays4;

public class Copy{

	    public static int[] copyArray(int[] original) {
	        int[] copy = new int[original.length];

	        for (int i = 0; i < original.length; i++) {
	            copy[i] = original[i];  
	        }

	        return copy;  
	    }

	    public static void main(String[] args) {
	       
	        int[] originalArray = {10, 20, 30, 40, 50};

	        
	        int[] copiedArray = copyArray(originalArray);

	        
	        System.out.print("Copied array: ");
	        for (int i = 0; i < copiedArray.length; i++) {
	            System.out.print(copiedArray[i] + " ");
	        }
	    }
	}


