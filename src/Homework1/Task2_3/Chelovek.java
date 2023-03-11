package Homework1.Task2_3;

import Homework1.Task1.Sexes;

import java.util.HashMap;

public class Chelovek implements ShkafImpl{

    private String firstName;
    private String lastName;
    private Sexes sex;
    Shkaf myShkaf;
    Cat myCat;

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
    }

    public Shkaf getShkaf(){
        return myShkaf;
    }

    public void toOpen(Shkaf shkaf) {
        if (shkaf.isOpen() == false)
            shkaf.setIsOpen(true);
    }

    public void toClose(Shkaf shkaf) {
        if (shkaf.isOpen() == true)
            shkaf.setIsOpen(false);
    }

    public void fillShelter(Shkaf shkaf, int number, int percentage){
        shkaf.setFilling(number, percentage);
    }

    @Override
    public String toString() {
        return getName();
    }

    public void getCat(String name, Sexes sex, int age) {
        this.myCat = new Cat(name, sex, age);
    }

    public void feedCat(Integer meal){
        myCat.eat(meal);
        System.out.println(myCat.getName() + " поел");
    }

    public void feedCat(Cat cat, Integer meal){
        cat.eat(meal);
        System.out.println(cat.getName() + " поел");
    }

    public void playWithCat(){
        System.out.println("Человек играет с " + myCat.getName());
        myCat.play();
    }

    public void playWithCat(Cat cat){
        System.out.println("Человек играет с " + cat.getName());
        cat.play();
    }

    public void callCat(){
        System.out.println("Человек позвал кота " + myCat.getName());
        myCat.answer();
    }

    public void callCat(Cat cat){
        System.out.println("Человек позвал кота " + cat.getName());
        cat.answer();
    }
}
