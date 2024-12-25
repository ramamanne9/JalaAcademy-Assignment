 //12. Write a method to remove duplicate elements from an array
package arrays4;

public class RemoveDuplicate {


	    public static int[] removeDuplicates(int[] arr) {
	        int n = arr.length;
	        int[] tempArray = new int[n];  
	        int uniqueCount = 0;    

	        for (int i = 0; i < n; i++) {
	            boolean isDuplicate = false;

	            for (int j = 0; j < uniqueCount; j++) {
	                if (arr[i] == tempArray[j]) {
	                    isDuplicate = true;  
	                    break;
	                }
	            }

	            if (!isDuplicate) {
	                tempArray[uniqueCount] = arr[i];
	                uniqueCount++;
	            }
	        }

	        int[] resultArray = new int[uniqueCount];
	        for (int i = 0; i < uniqueCount; i++) {
	            resultArray[i] = tempArray[i]; 
	        }

	        return resultArray;  
	    }

	    public static void main(String[] args) {
	        
	        int[] numbers = {10, 20, 10, 30, 40, 20, 50, 50};  // Example array with duplicates

	        int[] uniqueNumbers = removeDuplicates(numbers);

	        System.out.print("Array after removing duplicates: ");
	        for (int i = 0; i < uniqueNumbers.length; i++) {
	            System.out.print(uniqueNumbers[i] + " ");
	        }
	    }
	}

