
import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();

        // 1. Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("Initial list: " + fruits);

        // 2. Adding element at a specific position
        fruits.add(1, "Mango");
        System.out.println("After adding Mango at index 1: " + fruits);

        // 3. Accessing first and last elements
        System.out.println("First fruit: " + fruits.getFirst());
        System.out.println("Last fruit: " + fruits.getLast());

        // 4. Replacing an element
        fruits.set(2, "Orange"); // Replace "Banana" with "Orange"
        System.out.println("After replacing index 2 with Orange: " + fruits);

        // 5. Removing elements
        fruits.removeFirst(); // Remove the first element
        System.out.println("After removing first fruit: " + fruits);

        fruits.removeLast(); // Remove the last element
        System.out.println("After removing last fruit: " + fruits);

        // 6. Check if an element exists
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        // 7. Poll operations
        fruits.offerFirst("Pineapple");
        fruits.offerLast("Grapes");
        System.out.println("After offerFirst and offerLast: " + fruits);
        System.out.println("First fruit polled: " + fruits.pollFirst());
        System.out.println("Last fruit polled: " + fruits.pollLast());
        System.out.println("After polling: " + fruits);

        // 8. Sublist
        fruits.add("Dates");
        fruits.add("Kiwi");
        fruits.add("Peach");
        LinkedList<String> subList = new LinkedList<>(fruits.subList(0, 2));
        System.out.println("Sublist: " + subList);

        // 9. Reverse iteration
        System.out.println("Reverse order:");
        Iterator<String> reverseIterator = fruits.descendingIterator();
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }

        // 10. Convert to array
        String[] fruitArray = fruits.toArray(new String[0]);
        System.out.println("Array: ");
        for (String fruit : fruitArray) {
            System.out.println(fruit);
        }

        // 11. Stream API
        System.out.println("Fruits starting with 'D':");
        fruits.stream()
              .filter(fruit -> fruit.startsWith("D"))
              .forEach(System.out::println);


        // 13. Add all elements from another collection
        LinkedList<String> moreFruits = new LinkedList<>();
        moreFruits.add("Guava");
        moreFruits.add("Papaya");
        fruits.addAll(moreFruits);
        System.out.println("After adding more fruits: " + fruits);

        // 14. Clear the LinkedList
        fruits.clear();
        System.out.println("List after clearing: " + fruits);
    }
}
