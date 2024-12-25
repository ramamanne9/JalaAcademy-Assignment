/*Create an interface with a default method and implement it in a class. Do not provide
implementation to the default method and call the method.*/

package interfaces;
 

interface MyInterface {
  default void defaultMethod() {
     System.out.println("default method");
  }
 }

 class MyClass implements MyInterface {
 }

 public class Interface6 {
 public static void main(String[] args) {
     MyClass obj = new MyClass();

     obj.defaultMethod();  
 }
}
