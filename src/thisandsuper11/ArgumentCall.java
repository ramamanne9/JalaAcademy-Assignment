
//4.Call argument constructor of current class using this()


package thisandsuper11;

public class ArgumentCall {
    private String name;

    // Default constructor calls another constructor using 'this()'
    public ArgumentCall() {
        this("Default Name"); 
        System.out.println("Default Constructor Called");
    }

    public ArgumentCall(String name) {
        this.name = name;  
        System.out.println("Argument Constructor Called  " + name);
    }

    public static void main(String[] args) {
        ArgumentCall cl = new ArgumentCall();  
    }
}
