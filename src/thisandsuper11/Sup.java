//5.5. Call constructor of the parent class using super():


package thisandsuper11;

class Super{
    public Super() {
        System.out.println("Parent Class Constructor Called");
    }
}

class Sub extends Super {
    public Sub() {
        super();  
        System.out.println("Child Class Constructor Called");
    }

    public static void main(String[] args) {
    	Sub sb = new Sub();  
    }
}

