//2. Write text to a .txt file using OutputStream
package javaio15;

	import java.io.FileOutputStream;
	import java.io.IOException;

	public class WriteOutputStream {
	    public static void main(String[] args) {
	        try (FileOutputStream outputStream = new FileOutputStream("example.txt")) {
	            String text = "Hello, this is a test.";
	            outputStream.write(text.getBytes());
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}


