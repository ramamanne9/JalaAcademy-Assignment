//11. Write a program to find the common values between two arrays


package arrays4;

public class CommonElements {


	    public static void findCommonValues(int[] arr1, int[] arr2) {
	        boolean foundCommon = false;  

	        for (int i = 0; i < arr1.length; i++) {
	            for (int j = 0; j < arr2.length; j++) {
	                if (arr1[i] == arr2[j]) {
	                    System.out.println("Common value: " + arr1[i]);
	                    foundCommon = true;
	                    break;  
	            }
	        }}

	        if (!foundCommon) {
	            System.out.println("No common values found.");
	        }
	    }

	    public static void main(String[] args) {
	        int[] array1 = {1, 2, 3, 4, 5};  
	        int[] array2 = {4, 5, 6, 7, 8};  

	        findCommonValues(array1, array2);
	    }
	}

