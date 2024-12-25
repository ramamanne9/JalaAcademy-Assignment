//1.Class with Default, One Argument, and Two Argument Constructors

package constructors12;

 class DefaultConstructor {
	    public DefaultConstructor() { // Default constructor

	        System.out.println("Default Constructor Called");
	    }

	    public DefaultConstructor(int a) {
	        System.out.println("One Argument Constructor Called: " + a);
	    }

	    public DefaultConstructor(int a, String b) {
	        System.out.println("Two Argument Constructor Called: " + a + ", " + b);
	    }

	    public static void main(String[] args) {
	    	DefaultConstructor obj1 = new DefaultConstructor(); 
	    	DefaultConstructor obj2 = new DefaultConstructor(10); 
	    	DefaultConstructor obj3 = new DefaultConstructor(10, "Hello"); 
	    }
	}


