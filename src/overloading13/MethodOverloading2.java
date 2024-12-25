/* 2. Write two methods with the same name but different number of parameters of different
data type and call the methods from main metho */

package overloading13;

	class MethodOverloading2 {
	    
	    public void display(int a) {
	        System.out.println("Method with int parameter: " + a);
	    }
	    
	    public void display(String str) {
	        System.out.println("Method with String parameter: " + str);
	    }

	    public static void main(String[] args) {
	        MethodOverloading2 obj = new MethodOverloading2();
	        obj.display(10);         
	        obj.display("Hello");    
	    }
	}


