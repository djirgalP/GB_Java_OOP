package Homework1.Task3;

import Homework1.Task1.Sexes;
import Homework1.Task2.Chelovek;

public class Task3 {
    public static void main(String[] args) {
        Chelovek chelovek = new Chelovek("Доктор", "Плюшева", Sexes.F);
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
