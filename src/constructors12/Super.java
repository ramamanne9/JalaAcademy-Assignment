//2. Calling Constructors of Superclass from a Child Class
package constructors12;

public class Super {
	    public Super() {
	        System.out.println("SuperClass Default Constructor Called");
	    }

	    public Super(int a) {
	        System.out.println("SuperClass One Argument Constructor Called: " + a);
	    }
	}

	class Child extends Super {
	    public Child() {
	        super(); 
	        System.out.println("ChildClass Default Constructor Called");
	    }

	    public Child(int a) {
	        super(a); 
	        System.out.println("ChildClass One Argument Constructor Called: " + a);
	    }

	    public static void main(String[] args) {
	    	Child child1 = new Child(); 
	    	Child child2 = new Child(5); 
	    }
	}


