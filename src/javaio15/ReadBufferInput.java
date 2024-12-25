//3. Read text from a .txt file using BufferedInputStream:



package javaio15;

	import java.io.BufferedInputStream;
	import java.io.FileInputStream;
	import java.io.IOException;

	public class ReadBufferInput {
	    public static void main(String[] args) {
	        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("example.txt"))) {
	            int data;
	            while ((data = bufferedInputStream.read()) != -1) {
	                System.out.print((char) data);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}


