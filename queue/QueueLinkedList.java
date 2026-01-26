package queue;

import linkedList.SinglyLinkedList;

public class QueueLinkedList {
    public SinglyLinkedList list;

    public QueueLinkedList() {
        list = new SinglyLinkedList();
        System.out.println("Queue using linked list is successfully created");
    }

    public boolean isEmpty() {
        return list.head == null;
    }

    public void enQueue(int value) {
        list.insertInLinkedList(value, list.size);
        System.out.println("successfully inserted");
    }

    public int deQueue() {
        int value = -1;
        if (isEmpty()) {
            System.out.println("the Queue is empty");
        } else {
            value = list.head.value;
            list.deletionOfNode(0);
        }
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("the queue is empty");
            return -1;
        } else return list.head.value;
    }

    public void deleteQue() {
        list.head = null;
        list.tail=null;
    }
}
