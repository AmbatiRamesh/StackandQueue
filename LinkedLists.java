package com.stackandqueue;

public class LinkedLists {
        Node head;
        class Node {
            Object data;
            Node ref; // reference to next node
            Node(Object data) {
                this.data = data;
            }
        }
        public void peakLast(Object data) {
            Node newNode = new Node(data);
            Node temp = head;
            if (head == null)
                head = newNode;
            else if (head.ref == null)
                head.ref = newNode;
            else {
                while (temp.ref != null) {
                    temp = temp.ref;
                }
                temp.ref = newNode;
            }
        }
        public void display() {
            Node temp = head;
            if (head == null)
                System.out.println("No elements to show.");
            else {
                while (temp != null) {
                    if (temp.ref != null)
                        System.out.print(temp.data + " > ");
                    else
                        System.out.println(temp.data);
                    temp = temp.ref;
                }
            }
        }
}
