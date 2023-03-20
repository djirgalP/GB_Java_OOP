package Homework4;

public interface UserActionsImpl {
    public void addNewTask(Planner planner);
    public void showAllTasks(Planner planner);
    public void showSortedByPriority(Planner planner);
    public void deleteTaskByNumber(Planner planner);
    public void searchTaskByString(Planner planner);
    public void exportTasks(Planner planner);
}
