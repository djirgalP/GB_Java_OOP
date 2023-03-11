package Homework1.Task2;

import java.util.HashMap;

public class Shkaf {
    private Chelovek myOwner;

    int width;
    int height;
    int depth;
    private String color;
    private boolean isOpen;
    private HashMap<Integer, Integer> polki = new HashMap<>(); //ключ - номер полки, значение - заполненность полки

    public Shkaf(int width, int height, int depth, String color, int numberOfPolok) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.color = color;

        HashMap<Integer, Integer> filler = new HashMap<>();
        for (int i = 0; i < numberOfPolok; i++) {
            filler.put(i, 0);//заполненность каждой полки при создании = 0
        }
        this.polki = filler;
    }

    public void setOwner(Chelovek myOwner) {
        this.myOwner = myOwner;
    }

    public Chelovek getOwner() {
        return myOwner;
    }

    public void toOpen() {
        if (isOpen() == false)
            this.isOpen = true;
    }

    public void toClose() {
        if (isOpen() == true)
            this.isOpen = false;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void fillShelter(int number, int percentage){
        if (polki.get(number) != null) {
            int newVolume = polki.get(number);
            polki.put(number, newVolume + percentage);
        }
    }
    public void getFilling(){
        for (int shelter: polki.keySet()) {
            System.out.printf("Полка номер %d заполнена на %d процентов%n", shelter+1, polki.get(shelter));
        }
    }

    @Override
    public String toString() {
        return "Shkaf: " +
                "width=" + width +
                "cm, height=" + height +
                "cm, depth=" + depth +
                "cm, color='" + color +
                "Owner=" + myOwner.toString() +
                '}';
    }
}
