package day_two_samples;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Create a LinkedHashMap of Integer keys and String values
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // Add key-value pairs to the LinkedHashMap
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");

        // Print the LinkedHashMap
        System.out.println("LinkedHashMap: " + map);

        // Access a value using its key
        String value = map.get(2);
        System.out.println("Value for key 2: " + value);

        // Remove a key-value pair from the LinkedHashMap
        map.remove(3);
        System.out.println("LinkedHashMap after removing key 3: " + map);

        // Check if the LinkedHashMap contains a specific key or value
        boolean hasKey1 = map.containsKey(1);
        boolean hasValueThree = map.containsValue("Three");
        System.out.println("Contains key 1: " + hasKey1);
        System.out.println("Contains value 'Three': " + hasValueThree);

        // Iterate over the LinkedHashMap using a for-each loop
        System.out.println("Iterating over LinkedHashMap:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Get the size of the LinkedHashMap
        int size = map.size();
        System.out.println("Number of key-value pairs: " + size);

        // Clear all key-value pairs from the LinkedHashMap
        map.clear();
        System.out.println("LinkedHashMap after clearing: " + map);
    }
}
