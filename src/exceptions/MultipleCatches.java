
// 4.program with multiple catch blocks
 
package exceptions;

public class MultipleCatches {
    public static void main(String[] args) {
        int a[] = {5, 10};
        int b = 5;

        try {
            int X = a[2] / b - a[1];  // This will throw ArrayIndexOutOfBoundsException
        } 
        catch (ArrayIndexOutOfBoundsException e) {  // Catch specific exception first
            System.out.println("Array Index Error");
        }
        catch (ArithmeticException e) {  // Catch ArithmeticException next
            System.out.println("Divisible by zero");
        }
        catch (Exception e) {  // General exception catch block
            System.out.println("Some other exception occurred" );
        }

        int y = a[1] / a[0];  
        System.out.println("y=" + y);
    }
}

