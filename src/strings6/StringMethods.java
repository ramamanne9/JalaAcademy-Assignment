

//String Methods

package strings6;

public class StringMethods {
	    public static void main(String[] args) {
	        
// 5.  indexOf()
	        String str = "Programming language";
	        int index = str.indexOf("language");
	        System.out.println("Index of 'language': " + index); 
	        
 // 6. matches()
	        boolean matches = str.matches("Programming");  
	        System.out.println("Does the string match  " + matches); 
	        
// 7.  equals()
	        
	        String str1 = "hello";
	        String str2 = "Hello";
	        System.out.println("Using equals: " + str1.equals(str2));  
	        
// 8. equalsIgnoreCase(), startsWith(), endsWith(), and compareTo()
	        
	        System.out.println("Using equalsIgnoreCase: " + str1.equalsIgnoreCase(str2));  
	        System.out.println("Using startsWith): " + str2.startsWith("He"));
	        System.out.println("Using endsWith: " + str1.endsWith("lo"));
	        System.out.println("Using compareTo: " + str1.compareTo(str2));
	        
// 9.  trim()
	        String strg = "   Hello, World   ";
	        System.out.println("Trimmed string: '" + strg.trim() + "'");  
	        
// 10.  replace()
	        String replacedStr = str.replace('o', '0');  
	        System.out.println("Replaced string:" + replacedStr);  
	        
// 11.  split()
	        String str3= "apple,banana,orange";
	        String[] fruits = str3.split(",");
	        System.out.println("Splitting string into array:");
	        for (String fruit : fruits) {
	            System.out.println(fruit);  
	        }
	        
// 12.  valueOf()
	        int num = 123;
	        String numStr = String.valueOf(num);  
	        System.out.println("Converted number to string: " + numStr);  
	    }
	}


