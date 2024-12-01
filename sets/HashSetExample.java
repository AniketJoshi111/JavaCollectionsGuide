package sets;
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // 1. Creating a HashSet
        HashSet<String> fruits = new HashSet<>();
        
        // 2. Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple"); // Duplicate element, will not be added
        
        // 3. Iterating over elements
        System.out.println("All fruits in HashSet:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        // 4. Checking if an element exists
        System.out.println("Contains Banana? " + fruits.contains("Banana"));
        
        // 5. Removing an element
        fruits.remove("Banana");
        System.out.println("After removal of Banana: " + fruits);
        
        // 6. Checking if the set is empty
        System.out.println("Is the set empty? " + fruits.isEmpty());
        
        // 7. Clearing the set
        fruits.clear();
        System.out.println("After clearing: " + fruits);

        // 8. Converting HashSet to an array
        Object[] fruitArray = fruits.toArray();
        System.out.println("Fruits array: ");
        for (Object fruit : fruitArray) {
            System.out.println(fruit);
        }
    }
}

