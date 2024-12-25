//4. Write text to a .txt file using BufferedOutputStream

package javaio15;

	import java.io.BufferedOutputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;

	public class WriteBufferedOutput {
	    public static void main(String[] args) {
	        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("example.txt"))) {
	            String text = "Hello, Buffered Output Stream!";
	            bufferedOutputStream.write(text.getBytes());
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}


