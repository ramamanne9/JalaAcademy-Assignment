
// 1 .Different ways creating a string

package strings6;

public class StringCreation {
	    
 public static void main(String[] args) {
	        
	       String str1 = "Hello, World";	 // Using String Literal
           System.out.println("String Literal: " + str1);

	        String str2 = new String("Hello from new keyword!"); // Using new keyword
	        System.out.println("Using new keyword: " + str2);

	        char[] charArray = {'H', 'e', 'l', 'l', 'o'}; // Using char[] array
            String str4 = new String(charArray);
	        System.out.println("Using char[] array: " + str4);

	        StringBuilder sb = new StringBuilder(); //Using StringBuilder
            sb.append("Hello");
	        sb.append(" ");
	        sb.append("from StringBuilder!");
	        String str3 = sb.toString();
	        System.out.println("Using StringBuilder: " + str3);
	        
	        int age = 25;
	        String str5 = String.format("I am %d years old.", age);	//Using String.format()
            System.out.println("Using String.format(): " + str5);

	        String str6 = String.join(", ", "Hello", "World", "from", "join()"); // Using String.join()
            System.out.println("Using String.join(): " + str6);

	        char c = 'S';
	        String str8 = Character.toString(c); //Using Character.toString()
            System.out.println("Using Character.toString(): " + str8);
	        
	        String str7 = "Hello".concat(" World "); //Using concat()
            System.out.println("Using concat(): " + str7);

	        	    }
	}
