// 2.Handle the Arithmetic exception using try-catch block
 
package exceptions;

public class TryCatch {
public  static void main (String args[]) {
try {
	int value = 50/0;
}
catch (ArithmeticException e) 
{
System.out.println(e);
}
System.out.println("rest of the code will  print");

}
}