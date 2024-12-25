//3.Apply Private, Public, Protected, and Default Access Modifiers to the Constructor


package constructors12;

public class AccessModifiers {

	    // Public constructor
	    public AccessModifiers() {
	        System.out.println("Public Constructor Called");
	    }

	    // Protected constructor
	    protected AccessModifiers(int a) {
	        System.out.println("Protected Constructor Called with value: " + a);
	    }

	    // Default  constructor
	    AccessModifiers(String str) {
	        System.out.println("Default Constructor Called with value: " + str);
	    }

	    // Private constructor
	    private AccessModifiers(double d) {
	        System.out.println("Private Constructor Called with value: " + d);
	    }

	    public static void main(String[] args) {
	    	AccessModifiers obj1 = new AccessModifiers(); 
	    	AccessModifiers obj2 = new AccessModifiers(10); 
	    	AccessModifiers obj3 = new AccessModifiers("Test"); 
	        // Access to private constructor is not allowed outside the class
	    }
	}


