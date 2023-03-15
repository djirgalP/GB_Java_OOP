package Homework1.Task2_3;
/* Интерфейс для описания взаимодействия человека с животным */

public interface Interaction {
    public void feedAnimal(Integer meal);

    public void feedAnimal(Animal animal, Integer meal);

    void feedAnimal(Cat cat, Integer meal);

    public void playWithAnimal();

    public void playWithAnimal(Animal animal);

    void playWithAnimal(Cat cat);

    public void callAnimal();

    public void callAnimal(Animal animal);

    void callAnimal(Cat cat);
}
