/* Write two methods with the same name and same number of parameters of same type
and call from main method */


package overloading13;

class MethodOverloading3 {
 
 // Method with one int parameter
  
	public void display(int a) {
     System.out.println("Method with int parameter: " + a);
   }
 
   // public void display(int a)
   //Java does not allow overloading with same signatures 

   public void display(double a) {
   System.out.println("Second method with int parameter: " + a);
 }

 public static void main(String[] args) {
     MethodOverloading3 obj = new MethodOverloading3();
     obj.display(5);  
     obj.display(5.5);
 }
}
