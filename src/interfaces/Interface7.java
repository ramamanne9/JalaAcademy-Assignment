
//7. Create an interface and inherit it from the other interface.

package interfaces;

interface ParentInterface {
 void parentMethod();  
}

interface ChildInterface extends ParentInterface {
 void childMethod();  
}

class MyClass implements ChildInterface {

 @Override
 public void parentMethod() {
     System.out.println("Implemented parentMethod from ParentInterface.");
 }

 @Override
 public void childMethod() {
     System.out.println("Implemented childMethod from ChildInterface.");
 }
}

public class Interface7 {
 public static void main(String[] args) {
     MyClass mc = new MyClass(); 

     mc.parentMethod();  
     mc.childMethod();   
 }
}

