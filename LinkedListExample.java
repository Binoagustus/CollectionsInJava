package day_two_samples;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList of String type
        LinkedList<String> cities = new LinkedList<>();

        // Add elements to the LinkedList
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        cities.add("Houston");

        // Print the LinkedList
        System.out.println("Cities: " + cities);

        // Add an element at the first position
        cities.addFirst("San Francisco");
        System.out.println("Cities after adding San Francisco at the beginning: " + cities);

        // Add an element at the last position
        cities.addLast("Miami");
        System.out.println("Cities after adding Miami at the end: " + cities);

        // Access the first and last elements
        String firstCity = cities.getFirst();
        String lastCity = cities.getLast();
        System.out.println("First city: " + firstCity);
        System.out.println("Last city: " + lastCity);

        // Remove the first and last elements
        cities.removeFirst();
        cities.removeLast();
        System.out.println("Cities after removing first and last elements: " + cities);

        // Iterate over the LinkedList using a for-each loop
        System.out.println("Iterating over cities:");
        for (String city : cities) {
            System.out.println(city);
        }

        // Check if the LinkedList contains a specific element
        boolean hasChicago = cities.contains("Chicago");
        System.out.println("Contains Chicago: " + hasChicago);

        // Get the size of the LinkedList
        int size = cities.size();
        System.out.println("Number of cities: " + size);

        // Clear all elements from the LinkedList
        cities.clear();
        System.out.println("Cities after clearing: " + cities);
    }
}
