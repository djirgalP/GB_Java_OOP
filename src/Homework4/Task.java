package Homework4;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Task {
    private final int id;
    private Priority priority;
    private String description;
    private LocalTime created;
    private String deadlineTime;
    private String deadlineDate;
    private static int counter;

    static {
        counter = 1;
    }
    public Task() {
        this.description = "N/D";
        this.priority = Priority.LOW;
        this.created = LocalTime.now();
        this.deadlineTime = "N/D";
        this.deadlineDate = "N/D";
        this.id = counter++;
    }

    public Task(String description) {
        this.description = description;
        this.priority = Priority.LOW;
        this.created = LocalTime.now();
        this.deadlineTime = LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm"));
        this.deadlineDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd:MM:yyyy"));
        this.id = counter++;
    }

    public Task(String description, Priority priority) {
        this.description = description;
        this.priority = Priority.LOW;
        this.created = LocalTime.now();
        this.deadlineTime = LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm"));
        this.deadlineDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd:MM:yyyy"));
        this.id = counter++;
    }

    public Task(Priority priority, String description, String deadlineTime, String deadlineDate) {
        this.description = description;
        this.priority = priority;
        this.deadlineTime = deadlineTime;
        this.deadlineDate = deadlineDate;
        this.id = counter++;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
