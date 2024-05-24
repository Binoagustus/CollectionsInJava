package day_two_samples;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet of String type
        HashSet<String> set = new HashSet<>();

        // Add elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");

        // Print the HashSet
        System.out.println("HashSet: " + set);

        // Try to add a duplicate element
        boolean isAdded = set.add("Apple");
        System.out.println("Trying to add 'Apple' again: " + isAdded);

        // Check if the HashSet contains a specific element
        boolean hasBanana = set.contains("Banana");
        System.out.println("Contains 'Banana': " + hasBanana);

        // Remove an element from the HashSet
        set.remove("Cherry");
        System.out.println("HashSet after removing 'Cherry': " + set);

        // Iterate over the HashSet using a for-each loop
        System.out.println("Iterating over HashSet:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Get the size of the HashSet
        int size = set.size();
        System.out.println("Number of elements: " + size);

        // Clear all elements from the HashSet
        set.clear();
        System.out.println("HashSet after clearing: " + set);
    }
}
