package HashmapExample.answer;
import java.util.HashMap;

public class ContactCollection {
    /*
        FIELD
        Creating a private HashMap (or dictionary) field
        for storing Contact objects
        - type: HashMap<String, Contact>
        - access modifier: private
     */
    private HashMap<String, Contact> contacts;

    /*
        CONSTRUCTOR (A SPECIAL METHOD)
        Public Constructor that creates an object of this class
        initializing out contacts field
        - Returns: void (nothing)
     */
    public ContactCollection() {
        contacts = new HashMap<String, Contact>();
    }

    /*
        METHOD
        a method that takes a contact object parameter
        and adds it to our HasMap contacts field using
        the contact email as the key
        - Returns: void (nothing)
    */
    public void addContact(Contact contact) {
        String email = contact.getEmail();
        contacts.put(email, contact);
    }

    /*
        METHOD
        a method that takes a contact object parameter
        and adds it to our HashMap contacts field using
        the contact name as the key
        - Returns: void (nothing)
    */
    public void addContactByName(Contact contact) {
        String name = contact.getName();
        contacts.put(name, contact);
    }

    /*
        METHOD
        a getter method (gets the contacts field)
        - Returns: a Contact object
    */
    public Contact getContact(String theKey) {
        return contacts.get(theKey);
    }

}
