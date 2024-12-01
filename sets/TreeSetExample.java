import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // 1. Creating a TreeSet
        TreeSet<String> fruits = new TreeSet<>();
        
        // 2. Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");
        
        // 3. Iterating over elements (TreeSet sorts elements)
        System.out.println("All fruits in TreeSet:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        // 4. Checking if an element exists
        System.out.println("Contains Banana? " + fruits.contains("Banana"));
        
        // 5. Removing an element
        fruits.remove("Banana");
        System.out.println("After removal of Banana: " + fruits);
        
        // 6. First and last elements
        System.out.println("First element: " + fruits.first());
        System.out.println("Last element: " + fruits.last());
        
        // 7. Checking if the set is empty
        System.out.println("Is the set empty? " + fruits.isEmpty());
        
        // 8. Clearing the set
        fruits.clear();
        System.out.println("After clearing: " + fruits);
    }
}   
