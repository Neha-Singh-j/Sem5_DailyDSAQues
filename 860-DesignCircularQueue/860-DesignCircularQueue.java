// Last updated: 8/1/2025, 10:35:29 PM
import java.util.*;

class MyCircularQueue {

    private List<Integer> myCircularQueue;
    private int k;

    public MyCircularQueue(int k) {
        this.k = k;
        myCircularQueue = new LinkedList<>();
    }

    public boolean enQueue(int value) {
        if (myCircularQueue.size() == k) {
            return false; // Queue is full
        }
        myCircularQueue.add(value); // Add to rear
        return true;
    }

    public boolean deQueue() {
        if (myCircularQueue.isEmpty()) {
            return false;
        }
        myCircularQueue.remove(0); // Remove from front
        return true;
    }

    public int Front() {
        if (myCircularQueue.isEmpty()) {
            return -1;
        }
        return myCircularQueue.get(0);
    }

    public int Rear() {
        if (myCircularQueue.isEmpty()) {
            return -1;
        }
        return myCircularQueue.get(myCircularQueue.size() - 1);
    }

    public boolean isEmpty() {
        return myCircularQueue.isEmpty();
    }

    public boolean isFull() {
        return myCircularQueue.size() == k;
    }
}
