package com.Stacks;

import java.util.Stack;

public class InbuiltExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3); // push the item
        stack.push(4);
        stack.push(-1);
        System.out.println(stack.pop()); // remove the item
        stack.push(-5);
        stack.push(12);
        System.out.println(stack.pop());
        stack.push(6);
        System.out.println(stack.peek()); // return the element which is at the top of stack

        System.out.println(stack);
    }
}
