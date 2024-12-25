//5. Calling Constructor Multiple Times with the Same Object

package constructors12;

 class MultiConstructor {
	    public MultiConstructor() {
	        System.out.println("Default Constructor Called");
	    }

	    public MultiConstructor(int a) {
	        System.out.println("Constructor Called with value: " + a);
	    }

	    public void callMultipleTimes() {
	        new MultiConstructor(); 
	        new MultiConstructor(20); 
	    }

	    public static void main(String[] args) {
	    	MultiConstructor obj = new MultiConstructor(); // First constructor call
	        obj.callMultipleTimes(); 
	    }
	}


