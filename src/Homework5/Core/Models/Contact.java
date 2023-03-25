package Homework5.Core.Models;


public class Contact implements Comparable<Contact>{
    public String firstName;
    public String lastName;
    public String phone;
    public String description;

    public Contact(String firstName, String lastName, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
    }

    public Contact(String firstName, String lastName, String phone, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.description = description;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int compareTo(Contact o) {
        // ???...
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        Homework5.Core.Models.Contact t = (Homework5.Core.Models.Contact)obj;
        return (this.firstName.equals(t.firstName) && this.lastName.equals(t.lastName));
    }
}
