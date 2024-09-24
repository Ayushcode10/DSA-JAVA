package com.Queue;

public class CircularQueue{

    private int[] data;
    private final static int default_size = 5;
    private int size = 0;
    protected int front = 0;
    protected int end = 0;

    public CircularQueue(){
        this.data = new int[default_size];
    }
    public CircularQueue(int size){
        this.data = new int[size];
    }

    public boolean isFull(){
        return size == data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean add(int item){
        if (isFull()){
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public int front() throws Exception{
        if (isEmpty()){
            throw new Exception("no elements");
        }
        return data[front];
    }

    public void display(){
        if (isEmpty()){
            System.out.println("empty");
            return;
        }
        int i = front;
        do{
            System.out.print(data[i] + "<-");
            i++;
            i = i%data.length;
        }while(i != end);
        System.out.print("END");
    }


    public static void main(String[] args) throws Exception {
        CircularQueue q = new CircularQueue(6);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        System.out.println(q.remove());
        q.display();
        q.add(1);
        System.out.println();
        q.display();
    }
}
