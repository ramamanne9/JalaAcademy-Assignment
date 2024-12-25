
/*4.2 Access the public methods and fields from any class in the same package or different
package.*/
 

  package accessmodifier8;  // Same package as PublicClass

  public class SamePackageAccess {

    public static void main(String[] args) {
        // Create an object of PublicClass
        PublicClass publicObj = new PublicClass();

        // Access the public fields directly
        System.out.println("Name from PublicClass: " + publicObj.name);
        System.out.println("Age from PublicClass: " + publicObj.age);

        publicObj.printDetails();
    }
}
