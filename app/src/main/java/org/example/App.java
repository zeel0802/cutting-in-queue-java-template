package org.example;

import java.util.PriorityQueue;

public class App {
    private PriorityQueue<Job> jobQueue;

    public App() {
        // Initialize PriorityQueue with a max-heap order
        jobQueue = new PriorityQueue<>();
    }

    // Insert a new job into the job queue
    public void insert(Job job) {
        jobQueue.add(job);
    }

    // Run the highest priority job and remove it from the queue
    public void runHighestPriority() {
        if (!jobQueue.isEmpty()) {
            Job highestPriorityJob = jobQueue.poll();
            highestPriorityJob.execute();
        } else {
            System.out.println("No jobs in the queue.");
        }
    }

    public static void main(String[] args) {
        App app = new App();
        
        // Create some jobs
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
        
        // Run the jobs in order of priority
        app.runHighestPriority(); // Executes jobC (priority 9)
        app.runHighestPriority(); // Executes jobD (priority 8)
        app.runHighestPriority(); // Executes jobA (priority 5)
        app.runHighestPriority(); // Executes jobB (priority 2)
        app.runHighestPriority(); // Executes jobE (priority 1)
    }
}
