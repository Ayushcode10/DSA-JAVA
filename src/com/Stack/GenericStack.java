package com.Stack;

public class GenericStack {

    public static class Stack<t>{
        protected Object[] arr;
        private static final int DEFAULT_SIZE = 10;
        private int top = -1;
        public Stack() {
            this.arr = new Object[DEFAULT_SIZE];
        }
        public Stack(int size){
            this.arr = new Object[size];
        }
        public boolean isFull(){
            return top == arr.length-1;
        }

        public boolean isEmpty(){
            return top == -1;
        }

        public boolean push(t item) throws Exception{
            if(isFull()){
                throw new Exception("can't push item, stack is full");
            }
            top++;
            arr[top] = item;
            return true;
        }

        public t pop() throws Exception {
            if (isEmpty()){
                throw new Exception("Cant pop from an empty Stack!!");
            }
            Object removed = arr[top];
            top--;
            return (t) removed;
        }

        public t peek() throws Exception{
            if (isEmpty()){
                throw new Exception("Cant peek from an empty Stack");
            }
            return (t)arr[top];
        }
    }


    public static void main(String[] args) throws Exception {

        Stack<String> s = new Stack<String>();
        s.push("saxena");
        s.push("ayush");
        s.push("reddy");
        s.push("ruchika");
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
