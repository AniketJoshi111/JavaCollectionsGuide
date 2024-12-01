package sets;
import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {

        // 1. Creating two HashSets
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        
        // 2. Adding elements to the sets
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Cherry");
        
        set2.add("Banana");
        set2.add("Mango");
        set2.add("Peach");
        
        // 3. Union of two sets
        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union of set1 and set2: " + union);
        
        // 4. Intersection of two sets
        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection of set1 and set2: " + intersection);
        
        // 5. Difference of two sets
        Set<String> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference of set1 and set2: " + difference);
        
        // 6. Symmetric difference of two sets
        Set<String> symmetricDifference = new HashSet<>(set1);
        symmetricDifference.addAll(set2);

        Set<String> temp = new HashSet<>(set1);
        temp.retainAll(set2);

        symmetricDifference.removeAll(temp);
        System.out.println("Symmetric Difference of set1 and set2: " + symmetricDifference);
        
        // 7. Checking if a set contains all elements of another set
        System.out.println("set1 contains all elements of set2? " + set1.containsAll(set2));
        
        // 8. Clearing the sets
        set1.clear();
        set2.clear();
        System.out.println("After clearing, set1: " + set1 + ", set2: " + set2);
    }
}
