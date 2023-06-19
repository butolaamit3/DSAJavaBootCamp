//707. Design Linked List
package com.LinkedList;
class MyLinkedList {

    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
            this.next = null;
        }
    }
    Node head;
    int size;

    public MyLinkedList() {
        head = new Node(-1); //dummy Node
        size = 0;
    }

    public int get(int index) {
        if(index>=size){
            return -1;
        }
        Node temp = head.next;
        for(int i = 0;i<index;i++){
            temp = temp.next;
        }
        return temp.value;

    }

    public void addAtHead(int val) {
        Node temp = head.next;
        head.next = new Node(val);
        head.next.next = temp;
        size++;

    }

    public void addAtTail(int val) {
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = new Node(val);
        size++;
    }

    public void addAtIndex(int index, int val) {
        if(index>size){
            return;
        }
        Node temp  = head;
        for(int i = 0; i<index;i++){
            temp = temp.next;
        }
        Node temp1 = temp.next;
        temp.next = new Node(val);
        temp.next.next = temp1;
        size++;

    }

    public void deleteAtIndex(int index) {
        if(index>=size){
            return;
        }
        Node temp = head;
        for(int i = 0; i<index;i++){
            temp = temp.next;
        }
        Node temp1 = temp.next;
        temp.next = temp1.next;
        temp1.next = null;
        size--;


    }
}

