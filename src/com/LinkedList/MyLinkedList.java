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
        this.head = null;
        this.size = 0;
    }

    public int get(int index) {
        if(index>=size){
            return -1;
        }
        if(index==0){
            return head.value;
        }
        Node temp = head;
        for(int i = 1;i<index;i++){
            temp = temp.next;
        }
        return temp.next.value;

    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        size++;

    }

    public void addAtTail(int val) {
        Node node = new Node(val);
        if(head==null){
            addAtHead(val);
            return;
        }

        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = node;
        size++;
    }

    public void addAtIndex(int index, int val) {
        Node node  = new Node(val);
        if(index>size){
            return;
        }
        if(index==0){
            addAtHead(val);
            return;
        }

        Node temp  = head;
        for(int i = 1; i<index;i++){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size++;

    }

    public void deleteAtIndex(int index) {
        if(index>=size){
            return;
        }
        if(index==0){
            head = head.next;
            size--;
            return;
        }
        Node temp = head;
        for(int i = 1; i<index;i++){
            temp = temp.next;
        }

        Node temp2 = temp.next;
        temp.next = temp2.next;
        temp2.next = null;
        size--;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.println("END");
    }
}

