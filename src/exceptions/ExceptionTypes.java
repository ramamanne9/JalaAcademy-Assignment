
//8 to 18 Excetion types 

package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class ExceptionTypes {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;  
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception ");
        }

        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);  
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception ");
        }

        
        try {
            Class.forName("NonExistentClass");  
        } 
        catch (ClassNotFoundException e) {
            System.out.println("Class Not Found Exception occurred");
        }

        
        try {
            File file = new File("nonexistentfile.txt");
            Scanner sc = new Scanner(file);  
        } 
        catch (FileNotFoundException e) {
            System.out.println("File Not Found Exception occurred");
        }

       
        try {
            throw new IOException("IOException occurred");  
        } 
        catch (IOException e) {
            System.out.println("IOException occurred");
        }

        
        try {
            Class<?> clazz = String.class;
            Field field = clazz.getDeclaredField("nonExistingField");  
        } 
        catch (NoSuchFieldException e) {
            System.out.println("No Such Field Exception");
        }

        
        try {
            Class<?> clazz = String.class;
            Method method = clazz.getMethod("nonExistingMethod");  
        }
        catch (NoSuchMethodException e) {
            System.out.println("No Such Method Exception");
        }

        
        try {
            String str = null;
            System.out.println(str.length()); 
        }
        catch (NullPointerException e) {
            System.out.println("Null Pointer Exception occurred");
        }

        
        try {
            String str = "abc";
            int num = Integer.parseInt(str);  
        } 
        catch (NumberFormatException e) {
            System.out.println("Number Format Exception occurred");
        }

        
        try {
            String str = "Hello";
            System.out.println(str.charAt(10));  
        } 
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("String Index Out of Bounds Exception occurred");
        }

        try {
            Connection conn = DriverManager.getConnection("jdbc:invalidurl"); 
        } 
        catch (SQLException e) {
            System.out.println("SQL Exception occurred");
        }
    }
}

