package org.example;

public class Job implements Comparable<Job> {
    private String description;
    private int priority;

    public Job(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public void execute() {
        System.out.println("Executing: " + description);
    }

    @Override
    public int compareTo(Job other) {
        return Integer.compare(other.priority, this.priority); // Max priority first
    }
}
