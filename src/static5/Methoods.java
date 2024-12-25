
/* 
1.Program to creating  2 static variables, 2 Instance variables, 2 static methods, 2 instance
methods and a main method
2. Print instance variables in static methods
3.Print static variables in Instance methods
*/

package static5;

public class Methoods{

static String staticName1 ="john";
static String staticName2 ="jessy";
int instanceId1= 518;
int instanceId2=520;

public static  void staticMethod1() {
    
	System.out.println("Static Method1: " +staticName1);
    
	Methoods var = new  Methoods();
   System.out.println("Instance Method1: " + var.instanceId1);

}

public static  void staticMethod2() {

    System.out.println("Static Method2: " +  Methoods.staticName2);
   
    
    Methoods var = new  Methoods();
System.out.println("Instance Method1: " + var.instanceId2);

}

public   void instanceMethod1() {
    System.out.println("Static Method1: " +staticName1);
    System.out.println("Instance Method1: " + instanceId1);

}
public   void instanceMethod2() {
    System.out.println("Static Method2: " + instanceId2);
    System.out.println("Static Method2: " +Methoods .staticName2);

}

public static void main(String[]args){
	
	Methoods.staticMethod1(); 
	Methoods.staticMethod2();
	
	Methoods var = new Methoods();
	var.instanceMethod1();
	var.instanceMethod1();

}}