package com.stackandqueue;
public class StacksAndQueues {
    LinkedLists linkedlists = new LinkedLists();
    public void push(Object data) {
        linkedlists.peakLast(data);
    }
    public void display() {
        linkedlists.display();
    }
    public static void main(String[] args) {
        System.out.println("welcome to stack program");
        StacksAndQueues stack = new StacksAndQueues();
        stack.push(56);
        stack.push(30);
        stack.push(70);
        stack.display();
    }
}

