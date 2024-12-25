
/*2. Create a class with DEFAULT fields and methods. Access these fields and methods
from any other class in the same package */

package accessmodifier8;

class DefaultBaseClass1 {
    // Default fields (accessible within the same package)
    String name = "John";
    int age = 30;

    // Default method (accessible within the same package)
    void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
