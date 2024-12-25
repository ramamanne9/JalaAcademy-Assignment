/*5. Write two methods with the same name, number of parameters and data type but
different return Type */

package overloading13;

public class Overloading5 {

	    public int display(int a) {
	        System.out.println("Method with int parameter, return: " + a);
	        return a;
	    }
	    
	    public String display(String str) {
	        System.out.println("Method with String parameter, return: " + str);
	        return str;
	    }

	    public static void main(String[] args) {
	    	Overloading5 obj = new Overloading5();
	        int resultInt = obj.display(5);  
	        String resultString = obj.display("Hello");  
	        System.out.println("Returned int: " + resultInt);
	        System.out.println("Returned String: " + resultString);
	    }
	}


