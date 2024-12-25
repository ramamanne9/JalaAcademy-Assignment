//3.Call constructor of the current class using this()


package thisandsuper11;

public class ConstructorCall {
    private String name;

    public ConstructorCall() {
        this("Default Name");  
        System.out.println("Child Class Constructor Called");
    }

    public ConstructorCall(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        ConstructorCall cl = new ConstructorCall();  
}
}
