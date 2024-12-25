
//4. Call instance methods in static method

package static5;

public class InstanceCall {
	int instanceId1 = 518;
    int instanceId2 = 520;
	public   void instanceMethod() {
    System.out.println("Instance Method: " + instanceId1);

}
	public static  void staticMethod() {
   InstanceCall ic = new InstanceCall();
   System.out.println("Static Method: " +ic. instanceId2);
  
   // Calling the instance method in static method

		 ic.instanceMethod();

	}
	public static void main(String[] args) {
        // Calling the static method
		InstanceCall.staticMethod();
	}
    
}