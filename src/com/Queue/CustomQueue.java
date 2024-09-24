package com.Queue;

public class CustomQueue {
    private int[] data;
    private final static int DEFAULT_SIZE = 10;
    private int end = 0;

    public CustomQueue(){
        this.data = new int[DEFAULT_SIZE];
    }
    public CustomQueue(int size){
        this.data = new int[size];
    }

    public boolean isFull(){
        return end == data.length;
    }
    public boolean isEmpty(){
        return end == 0;
    }

    public boolean insert(int item){
        if (isFull()){
            return false;
        }
        data[end++] = item;
        return true;
    }

    public int remove() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int removed = data[0];

        //shift elements to left
        for (int i = 1; i <end ; i++) {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public int peek() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return data[0];
    }
    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.println(data[i]);
        }
        System.out.println("END");
    }





    public static void main(String[] args) throws Exception {
        CustomQueue q = new CustomQueue();
        q.insert(1);
        q.insert(2);
        q.insert(3);
        q.insert(4);

        q.remove();
        q.display();
        
    }
}
