package day_two_samples;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Create a LinkedHashSet of String type
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // Add elements to the LinkedHashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");

        // Print the LinkedHashSet
        System.out.println("LinkedHashSet: " + set);

        // Try to add a duplicate element
        boolean isAdded = set.add("Apple");
        System.out.println("Trying to add 'Apple' again: " + isAdded);

        // Check if the LinkedHashSet contains a specific element
        boolean hasBanana = set.contains("Banana");
        System.out.println("Contains 'Banana': " + hasBanana);

        // Remove an element from the LinkedHashSet
        set.remove("Cherry");
        System.out.println("LinkedHashSet after removing 'Cherry': " + set);

        // Iterate over the LinkedHashSet using a for-each loop
        System.out.println("Iterating over LinkedHashSet:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Get the size of the LinkedHashSet
        int size = set.size();
        System.out.println("Number of elements: " + size);

        // Clear all elements from the LinkedHashSet
        set.clear();
        System.out.println("LinkedHashSet after clearing: " + set);
    }
}
