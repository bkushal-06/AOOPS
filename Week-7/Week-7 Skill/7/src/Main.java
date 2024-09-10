import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactManager manager = new ContactManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nContact Management System:");
            System.out.println("1. Add Contact");
            System.out.println("2. Update Contact");
            System.out.println("3. Remove Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Find Contact by Name");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    manager.addContact(new Contact(name, phoneNumber, email));
                    break;
                case 2:
                    System.out.print("Enter name of contact to update: ");
                    String updateName = scanner.nextLine();
                    System.out.print("Enter new phone number: ");
                    String newPhoneNumber = scanner.nextLine();
                    System.out.print("Enter new email: ");
                    String newEmail = scanner.nextLine();
                    manager.updateContact(updateName, newPhoneNumber, newEmail);
                    break;
                case 3:
                    System.out.print("Enter name of contact to remove: ");
                    String removeName = scanner.nextLine();
                    manager.removeContact(removeName);
                    break;
                case 4:
                    manager.displayAllContacts();
                    break;
                case 5:
                    System.out.print("Enter name of contact to find: ");
                    String findName = scanner.nextLine();
                    Contact foundContact = manager.findContactByName(findName);
                    if (foundContact != null) {
                        System.out.println("Found Contact: " + foundContact);
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
