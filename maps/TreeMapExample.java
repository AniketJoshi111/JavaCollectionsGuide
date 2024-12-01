package maps;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // 1. Creating a TreeMap
        Map<String, Integer> fruitPrices = new TreeMap<>();
        
        // 2. Adding elements to the TreeMap
        fruitPrices.put("Apple", 100);
        fruitPrices.put("Banana", 30);
        fruitPrices.put("Cherry", 150);
        fruitPrices.put("Orange", 80);
        
        // 3. Iterating over elements (sorted by key)
        System.out.println("All fruit prices (sorted by key):");
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
