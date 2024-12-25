package collections16;

	import java.util.ArrayList;


	public class HashSet {
    private ArrayList<String> set;

    public HashSet() {
        set = new ArrayList<>();
    }

    public void add(String element) {
        if (!set.contains(element)) {  
            set.add(element);
        }
    }

    public void remove(String element) {
        set.remove(element);
    }

    public boolean contains(String element) {
        return set.contains(element);
    }

    public void display() {
        for (String element : set) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
    	HashSet set = new HashSet();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple");  

        set.display();
        System.out.println("Contains 'Banana': " + set.contains("Banana"));
        
        set.remove("Banana");
        set.display();
    }
}

