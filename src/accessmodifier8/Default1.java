/*1.Create a class with PRIVATE fields, private method and a main method. Print the fields
in main method. Call the private method in main method.
Create a sub class and try to access the private fields and methods from sub class.*/


package accessmodifier8;


	class ParentClass {
	    // Private fields
	    private String name = "John";
	    private int age = 25;

	    // Private method
	    private void displayInfo() {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }

	    // Main method
	    public static void main(String[] args) {
	        ParentClass parent = new ParentClass();
	        
	        // Accessing private fields via public getter methods (if needed)
	        System.out.println("Name: " + parent.name); // Direct access - Error
	        System.out.println("Age: " + parent.age);   // Direct access - Error
	        
	        // Accessing private method via a public method (if needed)
	        parent.displayInfo(); // Direct access - Error
	    }
	}

	class SubClass extends ParentClass {
	    public static void main(String[] args) {
	        SubClass sub = new SubClass();

	    }
	}

	


