import java.util.ArrayList;
import java.util.List;

class ToDoList {
    private List<String> tasks;

    public ToDoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    public void updateTask(int index, String newDescription) {
        if (index >= 0 && index < tasks.size()) {
            tasks.set(index, newDescription);
            System.out.println("Task updated at index " + index + ": " + newDescription);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            System.out.println("Task removed: " + tasks.remove(index));
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void displayTasks() {
        System.out.println("To-Do List:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + ": " + tasks.get(i));
        }
    }
}
