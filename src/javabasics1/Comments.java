//3.Write a program for a Single line comment, multi-line and documentation comments


package javabasics1;

public class Comments {

    public static void main(String[] args) {

        int sum = 5 + 3; // Adding 5 and 3

        /* Multi-line comment:
           This is a multi-line comment*/
          
           
        System.out.println("Sum: " + sum);

        /** Documentation comment:
         * This method prints a message.
         * It's used to show the sum result.
         */
        printMessage();  
    }

    public static void printMessage() {
        System.out.println("This is a message.");
    }
}
