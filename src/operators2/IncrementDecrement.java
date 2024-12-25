
//2. increment and decrement operators(++, --)

package operators2;

public class IncrementDecrement {

	    public static void increment(int value) {
	        System.out.println("Incremented value: " + (++value));
	    }

	    public static void decrement(int value) {
	        System.out.println("Decremented value: " + (--value));
	    }

	    public static void main(String[] args) {
	        int number = 10;

	        increment(number);

	        decrement(number);
	    }
	}


