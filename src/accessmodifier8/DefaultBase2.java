
/* 2. Create a class with DEFAULT fields and methods. Access these fields and methods
from any other class in the same package */

package accessmodifier8;

 //This class is in the same package as BaseClass
   class DefaultBaseClass2 {
   public static void main(String[] args) {
     // Create an instance of BaseClass
	 
	 DefaultBaseClass1 baseObj = new DefaultBaseClass1();

     // Access default fields from BaseClass
     System.out.println("Name from BaseClass: " + baseObj.name);
     System.out.println("Age from BaseClass: " + baseObj.age);

     // Call default method from BaseClass
     baseObj.printDetails();
 }
}
