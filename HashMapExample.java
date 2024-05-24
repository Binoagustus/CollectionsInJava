package day_two_samples;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		// Create a HashMap of Integer keys and String values
		HashMap<Integer, String> map = new HashMap<>();

		// Add key-value pairs to the HashMap
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");

		// Print the HashMap
		System.out.println("HashMap: " + map);

		// Access a value using its key
		String value = map.get(2);
		System.out.println("Value for key 2: " + value);

		// Remove a key-value pair from the HashMap
		map.remove(3);
		System.out.println("HashMap after removing key 3: " + map);

		// Check if the HashMap contains a specific key or value
		boolean hasKey1 = map.containsKey(1);
		boolean hasValueThree = map.containsValue("Three");
		System.out.println("Contains key 1: " + hasKey1);
		System.out.println("Contains value 'Three': " + hasValueThree);

		// Iterate over the HashMap using a for-each loop
		System.out.println("Iterating over HashMap:");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}

		// Get the size of the HashMap
		int size = map.size();
		System.out.println("Number of key-value pairs: " + size);

		// Clear all key-value pairs from the HashMap
		map.clear();
		System.out.println("HashMap after clearing: " + map);
	}
}
