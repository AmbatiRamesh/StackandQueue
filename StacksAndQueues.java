package com.stackandqueue;
public class StacksAndQueues {
    LinkedLists linkedlists = new LinkedLists();
    public void enQueue(Object data) {
        linkedlists.addFirst(data);
    }
    public void display() {
        linkedlists.display();
    }
    public static void main(String[] args) {
        System.out.println("welcome to Queue program");
        StacksAndQueues queue = new StacksAndQueues();
        queue.enQueue(70);
        queue.enQueue(30);
        queue.enQueue(56);
        queue.display();
    }

}