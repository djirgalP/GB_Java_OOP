package Homework1.Task2;

import Homework1.Task1.Sexes;

public class Chelovek {

    private String firstName;
    private String lastName;
    private Sexes sex;
    Shkaf myShkaf;

    public Chelovek(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Chelovek(String firstName, String lastName, Sexes sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
    }

    public String getName() {
        return firstName + ' ' + lastName;
    }

    public void buyShkaf(int width, int height, int depth, String color, int number) {
        this.myShkaf = new Shkaf(width, height, depth, color, number);
        //интересно, можно ли отсюда установить хозяина шкафа ? this.myShkaf.setOwner(chelovek);
    }

    public Shkaf getShkaf(){
        return myShkaf;
    }

    @Override
    public String toString() {
        return getName();
    }
}
