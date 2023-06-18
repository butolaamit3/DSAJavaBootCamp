package com.Stacks;
public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public CustomStack(int size){
        this.data = new int[size];
    }

    public CustomStack(){
        this(DEFAULT_SIZE);

    }

    public boolean push(int item) throws Exception {
        if(isFull()){
            throw new Exception("Stack is full");
        }
        ptr++;
        data[ptr]= item;
        return true;
    }

    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Cannot pop from an empty stack");
        }
//        int removed = data[ptr];
//        ptr--;
//        return removed;
        return data[ptr--];
    }

    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Cannot peek from an empty stack");
        }
        return data[ptr];
    }
    public boolean isFull() {
        return ptr ==data.length-1; //ptr is at last index
    }

    public boolean isEmpty(){
        return ptr == -1;
    }

}
