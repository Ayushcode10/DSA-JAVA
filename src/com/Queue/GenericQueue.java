package com.Queue;

import java.io.ObjectStreamException;

public class GenericQueue<e> {
    private Object[] data;
    private final static int DEFAULT_SIZE = 5;
    private int end = 0;

    public GenericQueue(){
        this.data = new Object[DEFAULT_SIZE];
    }
    public GenericQueue(int size){
        this.data = new Object[size];
    }

    public boolean isEmpty(){
        return end == 0;
    }

    public boolean isFull(){
        return end == data.length;
    }

    public boolean insert(e item){
        if (isFull()){
            Object[] temp = new Object[data.length*2];

            for (int i = 0; i < end; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        data[end++] = item;
        return true;
    }

    public e remove() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is Empty");
        }
        e removed = (e) data[0];

        //shift
        for (int i = 1; i <end ; i++) {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public e peek() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return (e)data[0];
    }

    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.println(data[i]);
        }
        System.out.println("END");
    }


    public static void main(String[] args) throws Exception {
        GenericQueue<Integer> q = new GenericQueue<>();

        q.insert(1);
        q.insert(2);
        q.insert(3);
        q.insert(4);
        q.insert(5);
        q.insert(6);
//        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.peek());
        System.out.println();
        q.display();
    }
}
