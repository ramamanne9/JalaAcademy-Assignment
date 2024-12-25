//6. Write text to a .txt file using FileWriter

package javaio15;

	import java.io.FileWriter;
	import java.io.IOException;

	public class WriteFile {
	    public static void main(String[] args) {
	        try (FileWriter fileWriter = new FileWriter("")) {
	            String text = "Hello, File Writer!";
	            fileWriter.write(text);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}


