import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        // Sample input text
        String text = "apple banana apple orange banana apple grape banana apple orange";
        
        // 1. Creating a HashMap to store word frequency
        Map<String, Integer> wordCount = new HashMap<>();
        
        // 2. Splitting the text into words
        String[] words = text.split(" ");
        
        // 3. Counting the frequency of each word
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
        // 4. Printing word frequencies
        System.out.println("Word frequencies:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // 5. Checking frequency of a specific word
        System.out.println("Frequency of 'apple': " + wordCount.get("apple"));
        
        // 6. Checking if a word exists
        System.out.println("Contains word 'grape'? " + wordCount.containsKey("grape"));
        
        // 7. Removing a word
        wordCount.remove("orange");
        System.out.println("After removal of 'orange': " + wordCount);
        
        // 8. Clearing the word count map
        wordCount.clear();
        System.out.println("After clearing: " + wordCount);
    }
}

