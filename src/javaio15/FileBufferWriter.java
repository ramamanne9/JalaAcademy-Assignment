
//8. Write text to a .txt file using BufferedWriter:

package javaio15;

	import java.io.BufferedWriter;
	import java.io.FileWriter;
	import java.io.IOException;

	public class FileBufferWriter {
	    public static void main(String[] args) {
	        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("example.txt"))) {
	            String text = "Hello, Buffered Writer!";
	            bufferedWriter.write(text);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}


