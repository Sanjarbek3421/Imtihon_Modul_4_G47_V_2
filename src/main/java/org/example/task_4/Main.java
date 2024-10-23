package org.example.task_4;

public class Main {
    public static void main(String[] args) {
        CustomHandler.log("This is an info message.");
        try {
            throw new Exception("Simulated exception");
        } catch (Exception e) {
            CustomHandler.logError("An error occurred.", e);
        }
        CustomHandler.log("Another info message.");
    }
}