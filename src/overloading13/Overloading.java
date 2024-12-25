/*Write two methods with the same name and same number of parameters of different
type and call from main method */


package overloading13;

public class Overloading {
	    
	    // Method with one integer parameter
	    public void display(int a) {
	        System.out.println("Method with int parameter: " + a);
	    }
	    
	    // Method with one string parameter
	    public void display(String str) {
	        System.out.println("Method with String parameter: " + str);
	    }

	    public static void main(String[] args) {
	    	Overloading obj = new Overloading();
	        obj.display(10);        
	        obj.display("Hello");   
	    }
	}


