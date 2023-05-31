package org.example.sem2.task2;

import org.example.sem2.task1.Actor;

public interface QueueBehaviour {

    void takeInQueue(Actor actor);
    void takeOrders();
    void giveOrders();
    void releaseFromQueue();
}
