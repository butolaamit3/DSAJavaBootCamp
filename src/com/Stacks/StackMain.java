package com.Stacks;

public class StackMain {
    public static void main(String[] args) throws Exception {
        CustomStack stack = new CustomStack(5);
        stack.push(12);
        stack.push(14);
        stack.push(2);
        stack.push(54);
        stack.push(18);
//        stack.push(211);//it will throw an error Stack is full

//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        DynamicStack stack1 = new DynamicStack();
        stack1.push(134);
        stack1.push(31);
        stack1.push(57);
        stack1.push(3);
        stack1.push(73);
        stack1.push(1);
        stack1.push(87);
        stack1.push(12);
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());


    }
}
