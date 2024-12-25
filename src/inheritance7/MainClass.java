package inheritance7;
class A {
    int dataA = 10;
    String nameA = "Class A";

    public void methodA1() {
        System.out.println("class A");

        System.out.println("Method A1");
    }

    public void methodA2() {
        System.out.println("Method A2");
    }

    public void overriddenMethod() {
        System.out.println(" Overridden Method");
    }
}

class B extends A {
    int dataB = 20;
    String nameB = "Class B";

    public void methodB1() {
        System.out.println("class B");

        System.out.println("Method B1");
    }

    public void methodB2() {
        System.out.println(" Method B2");
    }

    @Override
    public void overriddenMethod() {
        System.out.println(" Overridden Method");
    }}

class C extends B {
    int dataC = 30;
    String nameC = "Class C";

    public void methodC1() {
        System.out.println("class B");

        System.out.println(" Method C1");
    }

    public void methodC2() {
        System.out.println(" Method C2");
    }

    @Override
    public void overriddenMethod() {
        System.out.println(" Overridden Method");
    }
}

public class MainClass {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        C objC = new C();

        objA.methodA1();
        objA.methodA2();
        objA.overriddenMethod();  

        System.out.println();

        objB.methodB1();
        objB.methodB2();
        objB.overriddenMethod();  

        System.out.println();

        objC.methodC1();
        objC.methodC2();
        objC.overriddenMethod();  

        A refB = new B();  
        A refC = new C();  

        refB.overriddenMethod();  
        refC.overriddenMethod();  

        System.out.println("Accessing instance variables through polymorphism:");

        
        System.out.println("Class A  variable: " + refB.dataA); 

        System.out.println("Class B  variable: " + ((B) refB).dataB);  

        System.out.println("Class C  variable  " + ((C) refC).dataC);  
    }
}
