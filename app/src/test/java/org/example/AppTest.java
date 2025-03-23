package org.example;

public class AppTest {
    public static void main(String[] args) {
        App app = new App();

        // Create jobs
        Job jobA = new Job("This is job A", 5);
        Job jobB = new Job("This is job B", 2);
        Job jobC = new Job("This is job C", 9);
        Job jobD = new Job("This is job D", 8);
        Job jobE = new Job("This is job E", 1);

        // Insert jobs into the queue
        app.insert(jobA);
        app.insert(jobB);
        app.insert(jobC);
        app.insert(jobD);
        app.insert(jobE);

        // Running jobs in order of highest priority
        System.out.println("Running jobs by priority:");
        app.runHighestPriority(); // Should execute jobC (priority 9)
        app.runHighestPriority(); // Should execute jobD (priority 8)
        app.runHighestPriority(); // Should execute jobA (priority 5)
        app.runHighestPriority(); // Should execute jobB (priority 2)
        app.runHighestPriority(); // Should execute jobE (priority 1)
    }
}
