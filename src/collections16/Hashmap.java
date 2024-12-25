package collections16;

	import java.util.LinkedList;

	public class Hashmap {
	    private class Entry {
	        int key;
	        String value;
	        Entry(int key, String value) {
	            this.key = key;
	            this.value = value;
	        }
	    }

	    private LinkedList<Entry>[] table;
	    private int size;

	    public Hashmap(int capacity) {
	        table = new LinkedList[capacity];
	        size = 0;
	    }

	    private int hash(int key) {
	        return key % table.length;
	    }

	    public void put(int key, String value) {
	        int index = hash(key);
	        if (table[index] == null) {
	            table[index] = new LinkedList<>();
	        }
	        for (Entry entry : table[index]) {
	            if (entry.key == key) {
	                entry.value = value;
	                return;
	            }
	        }
	        table[index].add(new Entry(key, value));
	        size++;
	    }

	    public String get(int key) {
	        int index = hash(key);
	        if (table[index] != null) {
	            for (Entry entry : table[index]) {
	                if (entry.key == key) {
	                    return entry.value;
	                }
	            }
	        }
	        return null;
	    }

	    public boolean containsKey(int key) {
	        int index = hash(key);
	        if (table[index] != null) {
	            for (Entry entry : table[index]) {
	                if (entry.key == key) {
	                    return true;
	                }
	            }
	        }
	        return false;
	    }

	    public static void main(String[] args) {
	    	Hashmap map = new Hashmap(10);
	        map.put(101, "Alice");
	        map.put(102, "Bob");
	        System.out.println("Value for key 101: " + map.get(101));
	        System.out.println("Contains key 102: " + map.containsKey(102));
	    }
	}


