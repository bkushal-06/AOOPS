public class Main {
    public static void main(String[] args) {
        // Create instances of ArrayUtils for different data types
        ArrayUtils<Integer> intUtils = new ArrayUtils<>();
        ArrayUtils<String> stringUtils = new ArrayUtils<>();
        ArrayUtils<Character> charUtils = new ArrayUtils<>();
        ArrayUtils<Float> floatUtils = new ArrayUtils<>();

        // Test arrays for different data types
        Integer[] intArray = {10, 45, 23, 67, 5, 89};
        String[] stringArray = {"apple", "orange", "banana", "grape", "kiwi"};
        Character[] charArray = {'a', 'z', 'm', 'u', 'e'};
        Float[] floatArray = {10.5f, 23.7f, 5.4f, 89.0f, 45.1f};

        // Find and display max and min for Integer array
        System.out.println("Integer Array: " + java.util.Arrays.toString(intArray));
        System.out.println("Maximum Integer: " + intUtils.findMax(intArray));
        System.out.println("Minimum Integer: " + intUtils.findMin(intArray));

        // Find and display max and min for String array
        System.out.println("\nString Array: " + java.util.Arrays.toString(stringArray));
        System.out.println("Maximum String: " + stringUtils.findMax(stringArray));
        System.out.println("Minimum String: " + stringUtils.findMin(stringArray));

        // Find and display max and min for Character array
        System.out.println("\nCharacter Array: " + java.util.Arrays.toString(charArray));
        System.out.println("Maximum Character: " + charUtils.findMax(charArray));
        System.out.println("Minimum Character: " + charUtils.findMin(charArray));

        // Find and display max and min for Float array
        System.out.println("\nFloat Array: " + java.util.Arrays.toString(floatArray));
        System.out.println("Maximum Float: " + floatUtils.findMax(floatArray));
        System.out.println("Minimum Float: " + floatUtils.findMin(floatArray));
    }
}
