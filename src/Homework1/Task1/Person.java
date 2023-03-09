package Homework1.Task1;

import java.util.ArrayList;

public class Person {

    private String name;
    private String lastName;
    private Sexes sex;
    ArrayList<Person> family = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Person(String name, Sexes sex) {
        this.name = name;
        this.sex = sex;
    }

    public Person(String name, String lastName, Sexes sex) {
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return name + ' ' + lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Sexes getSex() {
        return sex;
    }

    public void setSex(Sexes sex) {
        this.sex = sex;
    }


    public ArrayList<Person> getFamily() {
        return family;
    }

    public void setFamily(ArrayList<Person> family) {
        this.family = family;
    }

    public void appendToFamily(Person person) {
        if (person != this && person != null) {
            family.add(person);
        }
    }

    @Override
    public String toString() {
        return "Person{" + name + ' ' + lastName + ' ' + sex + '}';
    }
}