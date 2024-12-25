//2.Print the fields/instance members of the parent class using super

package thisandsuper11;

public class ParentClass {
	    private String parentName = "Parent Class";

	    public void  parentFields() {
	        System.out.println("Parent Field: " + parentName);
	    }
	}

	class Child extends ParentClass {
	    public static void main(String[] args) {
	        Child child = new Child();
	        child.parentFields();  
	    }
	}


