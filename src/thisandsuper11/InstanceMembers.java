//1. Program to print the fields/instance members of the current class using this:



package thisandsuper11;

class InstanceMembers {

	    private String name = "john";

	    public void printCurrentFields() {
	        System.out.println("Child Field: " + this.name);
	    }
	    
	    public static void main(String[] args) {
	    	InstanceMembers  ins= new InstanceMembers ();
	        ins.printCurrentFields();  
	    }
	}

	    
          