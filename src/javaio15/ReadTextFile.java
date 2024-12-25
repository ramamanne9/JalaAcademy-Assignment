//5. Read text from a .txt file using FileReader
package javaio15;

import java.io.IOException;
import java.io.FileReader;  // Import the FileReader class from Java I/O
import java.io.IOException;

public class ReadTextFile {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("ex.txt")) {  // Corrected file name
            int data;
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);  // Convert data to character and print
            }
        } catch (IOException e) {
            e.printStackTrace();  // Print the stack trace if an error occurs
        }
    }
}
