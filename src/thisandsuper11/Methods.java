//6. Use this() and super() in methods (not in constructors):



package thisandsuper11;

 class Methods {
	    private String parentName = "Parent Class";

	    public void printParentFields() {
	        System.out.println("Parent Field: " + parentName);
	    }
	}

	class Child extends Methods {
	    private String childName = "Child Class";

	    public void printFieldsUsingSuperAndThis() {
	        System.out.println("Current Class Field: " + this.childName);  
	        super.printParentFields();  
	    }

	    public static void main(String[] args) {
	        Child child = new Child();
	        child.printFieldsUsingSuperAndThis();  
	    }
	}


