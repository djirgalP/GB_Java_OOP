package Homework5.Core.Models;


import java.util.*;

public class Contact implements Comparable<Contact>, Parser{
    public String firstName;
    public String lastName;
    public HashSet<String> phones;
    public String description;

    public Contact(String firstName, String lastName, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phones = new HashSet<>();
        this.description = description;
    }

    public Contact(String firstName, String lastName, String phones, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phones = new HashSet<>();
        this.phones = fromStringToSet(phones);
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

    public String getPhones() {
        String phonesString = "";
        if (!this.phones.isEmpty()){
            Iterator<String> itr = this.phones.iterator();
            phonesString = String.valueOf(itr.next());
            while(itr.hasNext())
                phonesString += " | " + itr.next();
        }
        return phonesString;
    }
    @Override
    public HashSet<String> fromStringToSet(String str) {
        List<String> phonesArray = new ArrayList<>(Arrays.asList(str.split("[;|, ]")));
        Iterator<String> phonesIterator = phonesArray.iterator();

        while(phonesIterator.hasNext()) {
            String value = phonesIterator.next();
            //System.out.println(value);
            if (value.equals("")){
                //System.out.println("removing empty values");
                phonesIterator.remove();
            }
        }
        return new HashSet<>(phonesArray);
    }

    public void addPhone(String phone) {
        if (this.phones.isEmpty()) {
            this.phones = new HashSet<>();
            this.phones.add(phone);
        }
        else
            this.phones.add(phone);

    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFullName() {
        return lastName + ' ' + firstName;
    }


    @Override
    public int compareTo(Contact o) {
        return this.getFullName().compareTo(o.getFullName());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        Contact t = (Contact)obj;
        return (this.firstName.equals(t.firstName) && this.lastName.equals(t.lastName));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        return result;
    }
}
