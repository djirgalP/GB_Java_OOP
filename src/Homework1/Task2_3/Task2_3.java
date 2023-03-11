package Homework1.Task2_3;

import Homework1.Task1.Sexes;

public class Task2_3 {
    public static void main(String[] args) {
        Chelovek chelovek = new Chelovek("Mary", "Poppins", Sexes.F);

    //Задание 2 про Человека и Шкаф
        chelovek.buyShkaf(160, 200, 60, "white", 5);
        chelovek.getShkaf().setOwner(chelovek);
        System.out.println("Человек по имени " + chelovek + " купил шкаф " + chelovek.getShkaf());
        chelovek.getShkaf().toOpen();
        System.out.println(chelovek + " открыл шкаф");
        chelovek.getShkaf().fillShelter(1, 10);
        chelovek.getShkaf().fillShelter(3, 30);
        chelovek.getShkaf().fillShelter(5, 50);
        System.out.println(chelovek + " заполнил шкаф таким образом: ");
        chelovek.getShkaf().getFilling();
        chelovek.getShkaf().toClose();
        System.out.println(chelovek + " закрыл шкаф ");

    //Задание 3 про Человека и Кошку
        chelovek.getCat("Мирошка", Sexes.M, 1);
        Cat cat2 = new Cat("Чужой", Sexes.F, 5);
        chelovek.callCat();
        chelovek.callCat(cat2);
        while (cat2.getHungriness() > 10)
            chelovek.playWithCat(cat2);
        chelovek.playWithCat();
        chelovek.playWithCat(cat2);
        chelovek.feedCat(5);
        chelovek.feedCat(cat2, 7);
    }
}
