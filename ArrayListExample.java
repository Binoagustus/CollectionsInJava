package day_two_samples;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of String type
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        // Print the ArrayList
        System.out.println("Fruits: " + fruits);

        // Access an element from the ArrayList
        String fruit = fruits.get(1);
        System.out.println("Second fruit: " + fruit);

        // Remove an element from the ArrayList
        fruits.remove("Cherry");
        System.out.println("Fruits after removing Cherry: " + fruits);

        System.out.println("Thrird fruit: " + fruits.get(2) + " after removing cherry");
        
        //Iterator
        System.out.println("Run using Iterator");
        Iterator<String> iter = fruits.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
        // Iterate over the ArrayList using a for-each loop
        System.out.println("Iterating over fruits:");
        for (String f : fruits) {
            System.out.println(f);
        }

        // Check if the ArrayList contains a specific element
        boolean hasApple = fruits.contains("Apple");
        System.out.println("Contains Apple: " + hasApple);

        // Get the size of the ArrayList
        int size = fruits.size();
        System.out.println("Number of fruits: " + size);

        // Clear all elements from the ArrayList
        fruits.clear();
        System.out.println("Fruits after clearing: " + fruits);
    }
}
