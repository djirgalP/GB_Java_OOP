package Homework4;

import java.util.*;

public class Planner implements Iterable<Task>{
    private ArrayList<Task> tasks;

    public Planner() {
        this.tasks = new ArrayList<>();
    }

    public void add(Task task) {
        this.tasks.add(task);
    }

    public int getSize() {
        return tasks.size();
    }

    public void showAll() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void showSortedByPriority(){
        tasks.sort(new TaskComparator());
        for (Task task : tasks) {
            System.out.println(task);
        }
    };

    public Task getById(int id) {
        return tasks.stream()
                .filter(task -> task.getId() == (id))
                .findFirst()
                .orElse(null);
    }

    public void totalSearch(String keyword) {
        int number = 0;
        System.out.println("Searching by word " + keyword);
        for (Task task : tasks) {
            String temp = task.toString();
            if (temp.toLowerCase().contains(keyword.toLowerCase())) {
                number++;
                System.out.println(temp);
            }
        }
        if (number == 0)
            System.out.println("No matching with word " + keyword);
    }

    public void sort() {
        Collections.sort(tasks);
    }

    @Override
    public Iterator<Task> iterator() {
        return new IteratorOfPlanner(this);
    }

    public Task getTask(int index) {
        return tasks.get(index);
    }
}
