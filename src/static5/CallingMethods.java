package static5;
//7.Call static methods and instance methods in main method
public class CallingMethods {
	    
		static String staticName1 = "john";
	    static String staticName2 = "jessy";
	    
	    int instanceId1 = 518;
	    int instanceId2 = 520;
	    
	    public static void staticMethod() {
	        System.out.println("Static Method1: " + staticName1);
	        
	        Methoods var = new Methoods();
	        System.out.println("Instance Method1: " + var.instanceId1);
	    }

	    

	    public void instanceMethod() {
	        System.out.println("Static Method1: " + staticName2);
	        System.out.println("Instance Method1: " + instanceId2);
	    }

	    
	    public static void main(String[] args) {
	       
	    	CallingMethods.staticMethod();
	        
	    	CallingMethods var = new CallingMethods();
	        
	        var.instanceMethod();  
	}

}
