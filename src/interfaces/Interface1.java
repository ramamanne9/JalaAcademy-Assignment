/*Create an interface with only one method and implement it in a class. Call the method
implemented */


package interfaces;


	interface MyInterface {
	    void displayMessage(); 
	}

	class MyClass implements MyInterface {
	    @Override
	    public void displayMessage() {
	        System.out.println("Hello, this is the implemented method in MyClass.");
	    }
	}

	public class Interface1 {
	    public static void main(String[] args) {
	        MyClass obj = new MyClass();

	        obj.displayMessage();  
	    }
	}


