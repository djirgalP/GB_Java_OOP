package Homework4;

public interface UserActionsImpl {
    public void addNewTask(Planner planner);
    public void showAllTasks(Planner planner);
    public void showSortedByPriority(Planner planner);

    public void deleteTask();
    public void exportTasks();
}
