//5.Write a program to +throw exception with your own message

package exceptions;

public class ThrowCatch {
    public static void main(String[] args) {
        int number = -5;  // This is the condition for throwing the exception

        try {
            if (number < 0) {
                throw new Exception("Number cannot be negative "  );
            }

            System.out.println("The number is: " + number);
            
        } catch (Exception e) {
            
        	System.out.println("Caught Exception: " + e);
        }
    }
}
    