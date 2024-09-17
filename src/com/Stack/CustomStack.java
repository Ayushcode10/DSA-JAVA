package com.Stack;

import java.net.http.WebSocketHandshakeException;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int top = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean isFull(){
        return top == data.length - 1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public int pop() throws StackException {
        if (isEmpty()){
            throw new StackException("cannot pop from an empty Stack!!");
        }
        int removed = data[top];
        top--;
        return removed;
    }

    public int peek() throws  StackException {
        if (isEmpty()){
            throw new StackException("Cannot peek from an empty Stack!!");
        }
        return data[top];
    }


    public boolean push(int item){
        if(isFull()){
            System.out.println("stack is full");
            return false;
        }
        top++;
        data[top] = item;
        return true;
    }

    public static void main(String[] args) throws Exception {
        CustomStack stack = new CustomStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());
    }
}
