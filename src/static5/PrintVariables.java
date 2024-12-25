
//6.Program to print all the static, instance variables in main method

package static5;

public class PrintVariables {
	    static String staticName1 = "john";
	    static String staticName2 = "jessy";
	    
	    int instanceId1 = 518;
	    int instanceId2 = 520;

	    public static void main(String[] args) {
	        System.out.println("Static Variable 1: " + PrintVariables.staticName1); 
	        System.out.println("Static Variable 2: " + PrintVariables.staticName2); 
	        
	        PrintVariables pvar = new PrintVariables();
	        
	        System.out.println("Instance Variable 1: " + pvar.instanceId1);
	        System.out.println("Instance Variable 2: " + pvar.instanceId2); 
	    }
	}


