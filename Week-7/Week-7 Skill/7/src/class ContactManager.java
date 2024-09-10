import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Define the ContactManager class
class ContactManager {
    // Use a Set to store unique contacts
    private Set<Contact> contactSet = new HashSet<>();
    // Use a Map to access contacts efficiently by name
    private Map<String, Contact> contactMap = new HashMap<>();

    // Method to add a new contact
    public boolean addContact(Contact contact) {
        if (contactSet.add(contact)) { // Adds to set, returns false if contact already exists
            contactMap.put(contact.getName(), contact); // Adds to map
            return true;
        } else {
            System.out.println("Contact with name '" + contact.getName() + "' already exists.");
            return false;
        }
    }

    // Method to update contact information
    public boolean updateContact(String name, String newPhoneNumber, String newEmail) {
        Contact contact = contactMap.get(name);
        if (contact != null) {
            contact.setPhoneNumber(newPhoneNumber);
            contact.setEmail(newEmail);
            return true;
        }
        System.out.println("Contact with name '" + name + "' not found.");
        return false;
    }

    // Method to remove a contact by name
    public boolean removeContact(String name) {
        Contact contact = contactMap.remove(name); // Removes from map
        if (contact != null) {
            contactSet.remove(contact); // Removes from set
            return true;
        }
        System.out.println("Contact with name '" + name + "' not found.");
        return false;
    }

    // Method to display all contacts
    public void displayAllContacts() {
        if (contactSet.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            System.out.println("Contacts:");
            for (Contact contact : contactSet) {
                System.out.println(contact);
            }
        }
    }

    // Method to find a contact by name
    public Contact findContactByName(String name) {
        return contactMap.get(name);
    }
}
