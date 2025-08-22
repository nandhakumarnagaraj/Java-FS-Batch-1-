package hashset;

import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        // Create a hash table with an initial capacity of 16.
        Hashtable<Integer, String> table = new Hashtable<>(16);

        // Insert some key-value pairs.
        table.put(10, "Value for 10");
        table.put(20, "Value for 20");
        table.put(30, "Value for 30");
        table.put(10, "New value for 10"); // Overwrites the previous value for key 10

        // Retrieve a value.
        String value = table.get(20);
        System.out.println("Value for key 20: " + value); // Output: Value for key 20: Value for 20

        // Remove a value.
        table.remove(30);

        // Iterate through the table (optional).
        for (Integer key : table.keySet()) {
            System.out.println("Key: " + key + ", Value: " + table.get(key));
        }
    }
}
