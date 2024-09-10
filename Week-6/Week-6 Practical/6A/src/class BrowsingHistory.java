import java.util.ArrayDeque;
import java.util.Deque;

class BrowsingHistory {
    private Deque<String> history;
    private Deque<String> forwardStack;

    public BrowsingHistory() {
        history = new ArrayDeque<>();
        forwardStack = new ArrayDeque<>();
    }

    public void visitPage(String page) {
        history.push(page);
        forwardStack.clear(); // Clear forward history when visiting a new page
        System.out.println("Visited: " + page);
    }

    public void goBack() {
        if (history.size() > 1) {
            forwardStack.push(history.pop());
            System.out.println("Back to: " + history.peek());
        } else {
            System.out.println("No previous page.");
        }
    }

    public void goForward() {
        if (!forwardStack.isEmpty()) {
            history.push(forwardStack.pop());
            System.out.println("Forward to: " + history.peek());
        } else {
            System.out.println("No forward page.");
        }
    }

    public void displayCurrentPage() {
        if (!history.isEmpty()) {
            System.out.println("Current page: " + history.peek());
        } else {
            System.out.println("No pages visited.");
        }
    }
}
