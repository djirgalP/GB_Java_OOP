package Homework5.Core.MVP;
import Homework5.Core.Infrastructure.*;
import Homework5.Core.Models.Contact;

import java.io.*;

public class Model {

    Phonebook currentBook;
    private int currentIndex;
    private final String path;//for import
    protected static String CSVFile = "/Users/Admin/IdeaProjects/GB_Java_OOP/src/Homework5/Phonebook.csv";
    protected static String JSONFile = "/Users/Admin/IdeaProjects/GB_Java_OOP/src/Homework5/Phonebook.json";
    protected static String XMLFile = "/Users/Admin/IdeaProjects/GB_Java_OOP/src/Homework5/Phonebook.xml";

    public Model(String path) {
        currentBook = new Phonebook();
        currentIndex = 0;
        this.path = path;
    }

    public Contact currentContact() {
        if (currentIndex >= 0) {
            return currentBook.getContact(currentIndex);
        } else {
            System.out.println("Index of Contact is incorrect, currentIndex = " + currentIndex);
            return null;
        }
    }

    public void load() {
        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String fname = reader.readLine();
            while (fname != null) {
                String lname = reader.readLine();
                String description = reader.readLine();
                String phone = reader.readLine();
                this.currentBook.add(new Contact(fname, lname, phone, description));
                fname = reader.readLine();
            }
            reader.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save() {
        try (FileWriter writer = new FileWriter(path, false)) {
            for (int i = 0; i < currentBook.count(); i++) {
                Contact contact = currentBook.getContact(i);
                writer.append(String.format("%s\n", contact.firstName));
                writer.append(String.format("%s\n", contact.lastName));
                writer.append(String.format("%s\n", contact.getPhones()));
                writer.append(String.format("%s\n", contact.description));
            }
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void exportToCSV() {
        PhonebookIterator phonebookIterator = new PhonebookIterator(currentBook);
        while (phonebookIterator.hasNext()) {
            ExpModel<Contact> saved = new ExpModel<>(phonebookIterator.next());
            saved.setFormat(new ExportToCSV());
            saved.setPath(CSVFile);
            saved.save();
        }
        System.out.println("Saved to CSV file");
    }

    public void exportToJSON() {
        PhonebookIterator phonebookIterator = new PhonebookIterator(currentBook);
        while (phonebookIterator.hasNext()) {
            ExpModel<Contact> saved = new ExpModel<>(phonebookIterator.next());
            saved.setFormat(new ExportToJSON());
            saved.setPath(JSONFile);
            saved.save();
        }
        System.out.println("Saved to JSON file");
    }

    public void exportToXML() {
        PhonebookIterator phonebookIterator = new PhonebookIterator(currentBook);
        while (phonebookIterator.hasNext()) {
            ExpModel<Contact> saved = new ExpModel<>(phonebookIterator.next());
            saved.setFormat(new ExportToXML());
            saved.setPath(XMLFile);
            saved.save();
        }
        System.out.println("Saved to XML file");
    }
    public Phonebook currentBook() {
        return this.currentBook;
    }

    public int getCurrentIndex() {
        return this.currentIndex;
    }

    public void setCurrentIndex(int value) {
        this.currentIndex = value;
    }
}