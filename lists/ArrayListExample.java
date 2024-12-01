package lists;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        // 1. Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // 2. Add at a specific index
        fruits.add(3, "Mango");

        // 3. Iterating over elements
        System.out.println("All fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        // 4. Getter (Accessing an element at a specific index)
        System.out.println("First fruit: " + fruits.get(0));

        // 5. Setter (Replacing an element at a specific index)
        fruits.set(1, "Orange");

        // 6. Iterating over elements after modification
        System.out.println("All fruits after adding orange:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 7. Contains (Checking if an element exists)
        System.out.println("Orange exists? : " + fruits.contains("Orange"));

        // 8. IndexOf (Getting the index of an element)
        System.out.println("Index of Orange: " + fruits.indexOf("Orange"));

        // 9. LastIndexOf (Getting the last index of an element)
        System.out.println("Last index of Orange: " + fruits.lastIndexOf("Orange"));

        // 10. SubList (Getting a sublist between two indexes)
        System.out.println("Sublist from index 1 to 3: " + fruits.subList(1, 4));

        // 11. Sorting (Sorting the list alphabetically)
        Collections.sort(fruits);
        System.out.println("Sorted List: " + fruits);

        // 12. forEach (Using forEach to iterate over elements)
        fruits.forEach(element -> System.out.println("Element: " + element));

        // 13. Removing an element
        fruits.remove("Banana");
        System.out.println("After removal: " + fruits);

        // 14. Clearing the list
        fruits.clear();
        System.out.println("After clearing: " + fruits);
    }
}
