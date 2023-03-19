package Homework4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Planner planner = new Planner();
        planner.add(new Task("Buy 10 kg of candies"));
        planner.add(new Task("Take a dress from the Atelier Prestige", Priority.HIGH, "12:00", "31.03.2023"));

        new MenuSwitchCase(new Scanner(System.in)).startMenu(planner);
    }
}
