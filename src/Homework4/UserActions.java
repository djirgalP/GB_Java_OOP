package Homework4;

import java.util.Scanner;

public class UserActions implements UserActionsImpl {
    private final Scanner scanner;
    private Planner planner;

    public UserActions(Scanner scanner) {
        this.scanner = scanner;
    }

    public UserActions(Scanner scanner, Planner planner) {
        this.scanner = scanner;
        this.planner = planner;
    }

    @Override
    public void addNewTask(Planner planner) {
        System.out.println("Adding a new Task.\n Enter Task description --> ");
        String descr = scanner.nextLine();

        System.out.println("\nEnter priority: 1 - Low, 2 - Medium, 3 - Immediate implementation --> ");
        String prior = scanner.nextLine();
        int priority = 0;
        if (prior.equals("1") | prior.equals("2") | prior.equals("3"))
            priority = Integer.parseInt(prior);
        else
            System.out.println("Incorrect code, in this case priority by default will be LOW");

        System.out.println("Enter responsible person --> ");
        String responsible = scanner.nextLine();

        System.out.println("Enter deadline date in format \"dd.MM.yyyy\" --> ");
        String deadlineDate = scanner.nextLine();

        System.out.println("Enter deadline time in format \"hh:mm\":");
        String deadlineTime = scanner.nextLine();

        planner.add(new Task(descr, Task.setPriorityCode(priority), responsible, deadlineDate, deadlineTime));
    }

    @Override
    public void showAllTasks(Planner planner) {
        if (planner.getSize() > 0)
            planner.showAll();
        else
            System.out.println("The planner of tasks is empty...");
    }

    @Override
    public void showSortedByPriority(Planner planner){
        if (planner.getSize() > 0)
            planner.showSortedByPriority();
        else
            System.out.println("The planner of tasks is empty...");
    }

    @Override
    public void deleteTaskByNumber(Planner planner){
        if (planner.getSize() > 0) {
            System.out.println("Enter the number of Task for deletion --> ");
            int number = Integer.parseInt(scanner.nextLine());
            planner.delete(number);
        } else {
            System.out.println("The planner of tasks is empty....");
        }
    }

    @Override
    public void searchTaskByString(Planner planner){
        if (planner.getSize() > 0) {
            System.out.println("Enter the word or part of the string of Task for searching --> ");
            String keyword = scanner.nextLine();
            planner.totalSearch(keyword);
        } else {
            System.out.println("The planner of tasks is empty...");
        }
    }

    @Override
    public void exportTasks(Planner planner){}
}
