//14. Converting to Upper case and lower case

package strings6;

public class UpperLower {
    public static void main(String[] args) {
        String input = "Hello World";

        // Convert string to upper case
        String uppercase = convertToUppercase(input);
        System.out.println("Uppercase: " + uppercase);

        // Convert string to lower case
        String lowercase = convertToLowercase(input);
        System.out.println("Lowercase: " + lowercase);
    }

    // Convert string to upper case manually
    public static String convertToUppercase(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result.append((char)(c - 32)); 
            } else {
                result.append(c); 
            }
        }
        return result.toString();
    }

    // Convert string to lower case manually
    
    public static String convertToLowercase(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                result.append((char)(c + 32)); 
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
