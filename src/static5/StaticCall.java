//5.Call static methods in instance methods

package static5;

public class StaticCall {
	static int instanceId1 = 518;
    int instanceId2 = 520;
	
   public static  void staticMethod() {
   System.out.println("Static Method: " +instanceId1);
}
   
   public   void instanceMethod() {
	   
  System.out.println("Instance Method: " + instanceId2);
        
  staticMethod();// Calling static method inside instance method
   }

	
   
	public static void main(String[] args) {
		StaticCall instanceVar = new StaticCall ();
		instanceVar. instanceMethod();
				}
    
}
