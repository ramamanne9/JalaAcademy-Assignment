//3. Use Interface instances to call the implemented method in the implemented class

package interfaces;

interface MyInterface {
    void implemented();  
}

class MyClass implements MyInterface {
    @Override
    public void implemented() {
        System.out.println("Method implemented in MyClass.");
    }
}

public class Interface3 {
    public static void main(String[] args) {
        MyInterface obj = new MyClass(); // instance of MyClass to call the method

        // Calling the implemented method using the interface reference
        obj.implemented();  
    }
}
