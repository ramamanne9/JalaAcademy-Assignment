//9. Read data from a properties file:


package javaio15;

	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;

	public class PropertiesFile {
	    public static void main(String[] args) {
	        Properties properties = new Properties();
	        try (FileInputStream fileInputStream = new FileInputStream("config.properties")) {
	            properties.load(fileInputStream);
	            String value = properties.getProperty("key"); // Replace "key" with your property key
	            System.out.println(value);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}


