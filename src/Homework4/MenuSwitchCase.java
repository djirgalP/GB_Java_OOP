package Homework4;

import java.util.Scanner;

public class MenuSwitchCase {
    private final Scanner scanner;

    public MenuSwitchCase(Scanner scanner) {
        this.scanner = scanner;
    }

    private void printMenu() {
        System.out.println("1 - Add new task");
        System.out.println("2 - Show all tasks");
        System.out.println("3 - Sort tasks by priority");
        System.out.println("4 - Delete task by number");
        System.out.println("5 - Export");
        System.out.println("6 - Quit");
    }

    public void startMenu(Planner planner) {
        if (this.scanner != null) {
            String option;
            do {
                printMenu();
                System.out.print("Please, choose one of the operations:\n");
                option = this.scanner.nextLine().toString();
                switch (option) {
                    case "1":
                        System.out.println("Add new task");
                        planner.add(new Task("Buy 1 kg of potato"));
                        break;
                    case "2":
                        System.out.println("Show all tasks");
                        planner.showAll();
                        break;
                    case "3":
                        System.out.println("Sort tasks by priority");
                        planner.sortByPriority();
                        planner.showAll();
                        break;
                    case "4":
                        System.out.println("Delete task by number");
                    case "5":
                        System.out.println("Export");
                    case "6":
                        System.out.println("Shutting down the program...");
                        break;
                    default:
                        System.out.println("You've entered incorrect menu number...\n");
                }
            } while (!option.equals("6"));
        }
    }
}
