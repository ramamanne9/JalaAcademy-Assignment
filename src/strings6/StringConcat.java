package strings6;

public class StringConcat {
	    
	public static void main(String[] args) {
		
 // 2.Concatenating two strings using + operator
	        String str1 = "Wellcome to";
	        String str2 = "java";
	        String str3 = str1 + " " + str2;  
	        System.out.println(str3);
	         
 // 3.Calculate length using a loop

	         String str = "Hello, World ";
	         int length = 0;
	         for (int i = 0; i < str.charAt(i); i++) {
	             length++;
	         }
	         
	         System.out.println("Length of the string: " + length);
	         
//4.Extracting a string using Substring
	         
	         String name =   "Rama manne";
	          int start = 5; 
	          int end = 9;
	          String result = " ";
	          for (int i = start; i <= end; i++) {
	              result += name.charAt(i);  
	          }
	          System.out.println("Extracted Substring: " + result);

	}
	}


