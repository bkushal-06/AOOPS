import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> strings = Arrays.asList("banana", "apple", "cherry", "date");

        // Sort the list in descending order using a lambda expression
        strings.sort((s1, s2) -> s2.compareTo(s1));

        // Print the sorted list
        System.out.println("Sorted list in descending order: " + strings);
    }
}
