package org.example.task_1;

public class OrderService {
    int orderCount;
    public synchronized void increaseOrderCount(){
        this.orderCount +=1;
    }

    public int getOrderCount() {
        return orderCount;
    }
}
