package Homework1.Task2;

import Homework1.Task1.Sexes;

public class Task2 {
    public static void main(String[] args) {
        Chelovek chelovek = new Chelovek("Mary", "Poppins", Sexes.F);
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
    }
}
