package Homework1.Task2_3;
import Homework1.Task1.Sexes;

public class Cat extends Animal implements MammalsImpl{
    private String name;
    private Sexes sex;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;
    private int hungriness;


    public Cat(String name) {
        super("Кошачье");
        this.name = name;
    }
    public Cat(String name, Sexes sex, int age) {
        super("Кошачье");
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.hungriness = 10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String animalClass = super.toString();
        return animalClass + " " + this.name;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String voice() {
        return this.name + " говорит:\"Мяяяяу!!!\"";
    }

    @Override
    public void eat(Integer food) {
        this.hungriness += food;
    }

    @Override
    public void play() {
        if (this.hungriness <= 10) {
            this.hungriness = 0;
            System.out.println(this.name + " играть уже нет сил, надо бы покормить...");
        } else {
            System.out.println(voice());
            this.hungriness -= 10;
        }
    }

    @Override
    public void answer(){
        if (this.hungriness <= 10) {
            this.hungriness = 0;
            System.out.println(this.name + " молчит т.к. нет сил, надо бы покормить...");
        } else {
            System.out.println(voice());
            this.hungriness -= 5;
        }
    }

    @Override
    public int getHungriness() {
        return this.hungriness;
    }
}
