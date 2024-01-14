import java.util.*;

public class Navigableex {

    public static void main(String[] args) {
        // Create a NavigableMap (TreeMap in this case)
        NavigableMap<Integer, String> navigableMap = new TreeMap<>();

        // Add entries to the map
        navigableMap.put(1, "One");
        navigableMap.put(4, "Four");
        navigableMap.put(2, "Two");
        navigableMap.put(5, "Five");
        navigableMap.put(3, "Three");

        // Print the original map
        System.out.println("Original NavigableMap: " + navigableMap);

        // Navigating the map
        System.out.println("Ceiling Entry for key 2: " + navigableMap.ceilingEntry(2));
        System.out.println("Floor Entry for key 2: " + navigableMap.floorEntry(2));
        System.out.println("Higher Entry for key 2: " + navigableMap.higherEntry(2));
        System.out.println("Lower Entry for key 2: " + navigableMap.lowerEntry(2));

        // Print the map in reverse order
        System.out.println("Descending Map: " + navigableMap.descendingMap());

        // Print the first and last entries
        System.out.println("First Entry: " + navigableMap.firstEntry());
        System.out.println("Last Entry: " + navigableMap.lastEntry());

        // Remove entries using navigation methods
        System.out.println("Removing entries using navigation methods:");
        navigableMap.pollFirstEntry();
        navigableMap.pollLastEntry();
        System.out.println("Updated NavigableMap: " + navigableMap);
    }
}