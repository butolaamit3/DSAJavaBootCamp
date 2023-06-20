package com.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.addAtHead(1);
        ll.addAtTail(3);
        ll.addAtIndex(1,2);
        ll.display();
        System.out.println(ll.get(1));
        ll.deleteAtIndex(1);
        ll.display();
        System.out.println(ll.get(1));
        ll.display();
    }
}
