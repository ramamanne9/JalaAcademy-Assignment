//4. Constructors with Return Type int and String

package constructors12;
 

public class ReturnType {

    public ReturnType() {
        System.out.println("Constructor called");
    }

    public int ReturnIntType() {
        System.out.println("Method with return type int Called");
        return 10;
    }

    public String ReturnStringType() {
        System.out.println("Method with return type String Called");
        return "Hello, World!";
    }

    public static void main(String[] args) {
        ReturnType obj = new ReturnType();

        int resultInt = obj.ReturnIntType();
        System.out.println("Returned int: " + resultInt);

        String resultString = obj.ReturnStringType();
        System.out.println("Returned String: " + resultString);
    }
}
