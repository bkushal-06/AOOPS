public class Main {
    public static void main(String[] args) {
        // Test LinkedListStack with Integer
        Stack<Integer> intStackLinkedList = new LinkedListStack<>();
        intStackLinkedList.push(10);
        intStackLinkedList.push(20);
        intStackLinkedList.push(30);
        System.out.println("LinkedListStack Integer Peek: " + intStackLinkedList.peek());
        System.out.println("LinkedListStack Integer Pop: " + intStackLinkedList.pop());
        System.out.println("LinkedListStack Integer isEmpty: " + intStackLinkedList.isEmpty());

        // Test ArrayStack with Integer
        Stack<Integer> intStackArray = new ArrayStack<>();
        intStackArray.push(10);
        intStackArray.push(20);
        intStackArray.push(30);
        System.out.println("\nArrayStack Integer Peek: " + intStackArray.peek());
        System.out.println("ArrayStack Integer Pop: " + intStackArray.pop());
        System.out.println("ArrayStack Integer isEmpty: " + intStackArray.isEmpty());

        // Test LinkedListStack with String
        Stack<String> stringStackLinkedList = new LinkedListStack<>();
        stringStackLinkedList.push("apple");
        stringStackLinkedList.push("banana");
        stringStackLinkedList.push("cherry");
        System.out.println("\nLinkedListStack String Peek: " + stringStackLinkedList.peek());
        System.out.println("LinkedListStack String Pop: " + stringStackLinkedList.pop());
        System.out.println("LinkedListStack String isEmpty: " + stringStackLinkedList.isEmpty());

        // Test ArrayStack with Character
        Stack<Character> charStackArray = new ArrayStack<>();
        charStackArray.push('A');
        charStackArray.push('B');
        charStackArray.push('C');
        System.out.println("\nArrayStack Character Peek: " + charStackArray.peek());
        System.out.println("ArrayStack Character Pop: " + charStackArray.pop());
        System.out.println("ArrayStack Character isEmpty: " + charStackArray.isEmpty());
    }
}
