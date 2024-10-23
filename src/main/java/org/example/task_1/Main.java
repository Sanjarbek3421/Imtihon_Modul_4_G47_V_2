package org.example.task_1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        OrderService orderCounter = new OrderService();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 30_000_000; i++) {
            executorService.execute(() ->
                    orderCounter.increaseOrderCount());
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);
        System.out.println(orderCounter.getOrderCount());
    }
}
