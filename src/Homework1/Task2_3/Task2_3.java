package Homework1.Task2_3;

import Homework1.Task1.Sexes;

public class Task2_3 {
    public static void main(String[] args) {
        Chelovek chelovek = new Chelovek("Mary", "Poppins", Sexes.F);

    //Задание 2 про Человека и Шкаф
        chelovek.buyShkaf(160, 200, 60, "white", 5);
        chelovek.getShkaf().setOwner(chelovek);
        System.out.println("Человек по имени " + chelovek + " купил шкаф " + chelovek.getShkaf());
        chelovek.toOpen(chelovek.getShkaf());
        System.out.println(chelovek + " открыл шкаф");
        chelovek.fillShelter(chelovek.getShkaf(),1, 10);
        chelovek.fillShelter(chelovek.getShkaf(),3, 30);
        chelovek.fillShelter(chelovek.getShkaf(),5, 50);
        System.out.println(chelovek + " заполнил шкаф таким образом: ");
        chelovek.getShkaf().getFilling();
        chelovek.toClose(chelovek.getShkaf());
        System.out.println(chelovek + " закрыл шкаф ");

    //Задание 3 про Человека и Кошку
        chelovek.setCat("Мирошка", Sexes.M, 1);
        Cat cat2 = new Cat("Чужой", Sexes.F, 5);
        chelovek.callAnimal();
        chelovek.callAnimal(cat2);
        while (cat2.getHungriness() > 10)
            chelovek.playWithAnimal(cat2);
        chelovek.playWithAnimal();
        chelovek.playWithAnimal(cat2);
        chelovek.feedAnimal(5);
        chelovek.feedAnimal(cat2, 7);
        chelovek.callAnimal(cat2);
        System.out.printf("Уровень голода кота по имени %s = %d \n", cat2.getName(), cat2.getHungriness());
        System.out.printf("Уровень голода кота по имени %s = %d \n",  chelovek.getCat().getName(), chelovek.getCat().getHungriness());
    }
}
