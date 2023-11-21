package HashmapExample.answer;

public class Contact {
    /*
        FIELD
        a private field that stores a string value
        - type: String
        - access modifier: private
     */
    private String name;
    /*
        FIELD
        a private field that stores a string value
        - type: String
        - access modifier: private
     */
    private String phoneNumber;
    /*
        FIELD
        a private field that stores a string value
        and are expected to be unique
        - type: String
        - access modifier: private
     */
    private String email;

    // constructor that creates an object of this class
    public Contact(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phone;
    }

    // getter method (returns name)
    public String getName() {
        return name;
    }

    // getter method (returns email)
    public String getEmail() {
        return email;
    }

    // getter method (returns phone number)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // returns the string format of our object showing all fields inside the object
    public String toString() {
        return "Contact name: " + name + " email: " + email + " phone number " + phoneNumber;
    }
}

