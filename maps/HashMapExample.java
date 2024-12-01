package maps;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // 1. Creating a HashMap
        Map<String, Integer> fruitPrices = new HashMap<>();
        
        // 2. Adding elements to the HashMap
        fruitPrices.put("Apple", 100);
        fruitPrices.put("Banana", 30);
        fruitPrices.put("Cherry", 150);
        fruitPrices.put("Apple", 120); // Updating value for the key "Apple"
        
        // 3. Iterating over elements
        System.out.println("All fruit prices:");
        for (Map.Entry<String, Integer> entry : fruitPrices.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // 4. Accessing value for a key
        System.out.println("Price of Banana: " + fruitPrices.get("Banana"));
        
        // 5. Checking if a key exists
        System.out.println("Contains key 'Orange'? " + fruitPrices.containsKey("Orange"));
        
        // 6. Checking if a value exists
        System.out.println("Contains value 150? " + fruitPrices.containsValue(150));
        
        // 7. Removing an element
        fruitPrices.remove("Cherry");
        System.out.println("After removal of Cherry: " + fruitPrices);

        // 8. Checking the size of the map
        System.out.println("Size of the map: " + fruitPrices.size());

        // 9. Clearing the map
        fruitPrices.clear();
        System.out.println("After clearing: " + fruitPrices);
    }
}
