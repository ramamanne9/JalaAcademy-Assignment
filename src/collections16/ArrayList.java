package collections16;

	import java.util.Arrays;

	public class ArrayList {
	    private String[] array;
	    private int size;

	    public ArrayList (int initialCapacity) {
	        array = new String[initialCapacity];
	        size = 0;
	    }

	    public void add(String element) {
	        if (size == array.length) {
	            array = Arrays.copyOf(array, array.length * 2);
	        }
	        array[size] = element;
	        size++;
	    }

	    public String get(int index) {
	        if (index >= 0 && index < size) {
	            return array[index];
	        }
	        return null; 
	    }

	    public void remove(int index) {
	        if (index >= 0 && index < size) {
	            for (int i = index; i < size - 1; i++) {
	                array[i] = array[i + 1];
	            }
	            array[size - 1] = null;
	            size--;
	        }
	    }

	    public int size() {
	        return size;
	    }

	    public void display() {
	        for (int i = 0; i < size; i++) {
	            System.out.println(array[i]);
	        }
	    }

	    public static void main(String[] args) {
	    	ArrayList list = new ArrayList(5);
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");

	        list.display();

	        list.remove(1);
	        System.out.println("After removal:");
	        list.display();

	        System.out.println("Element at index 1: " + list.get(1));
	        System.out.println("Size of the list: " + list.size());
	    }
	}


