package javabasics1;

	public class VariableScope {

	    int x = 10; // Global  variable 

	    public void scope() {
	        int x = 20;	 // Local variable 


	        System.out.println("Local variable: " + x); 
	    }

	    public static void main(String[] args) {
	        VariableScope vs = new VariableScope();

	        vs.scope();

	        
	        System.out.println("Global variable: " + vs.x); 
	    }
	}


