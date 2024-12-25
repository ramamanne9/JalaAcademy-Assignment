//1. Two Methods with the Same Name but Different Number of Parameters of the Same Type

package overloading13;

public class MethodOverloading {
    
	// Method with one parameter

	    public void display(int a) {
	        System.out.println("Method with one parameter: " + a);
	    }
	    
	    // Method with two parameters
	    public void display(int a, int b) {
	        System.out.println("Method with two parameters: " + a + ", " + b);
	    }

	    public static void main(String[] args) {
	        MethodOverloading obj = new MethodOverloading();
	        obj.display(5);       
	        obj.display(5, 10);    
	    }
	}


