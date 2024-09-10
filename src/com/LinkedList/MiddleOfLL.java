package com.LinkedList;

public class MiddleOfLL {
    //pointers
    private Node head;
    private Node tail;
    //maintains the size of the list
    private int size;

    public MiddleOfLL(){
        //initialise the size with 0
        this.size = 0;
    }
    public int middle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.value;
    }

    public void addLast(int val){
        Node node = new Node(val);
        if (head == null){
            head = node;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next= node;
        size += 1;

    }

    public void display(){
        //create a temp pointer which points to the node where head is pointing
        //i.e the first node
        Node temp = head;

        //iterate the temp through the LL till the node != null
        while(temp != null){
            //print the node's value
            System.out.print(temp.value + " -> ");
            //update the temp to the next node
            temp = temp.next;
        }
        System.out.print("Null");
    }


    private static class Node{
        //contains the value
        private final int value;
        //pointer to the next Node
        //this is a ref var of type node because it's pointing to something which is type node
        private Node next;

        //constructor for value as an input
        public Node(int value){
            this.value = value;
        }

        //constructor for value and a Node as an input
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        MiddleOfLL l = new MiddleOfLL();
        l.addLast(1);
        l.addLast(2);
        l.addLast(3);
        l.addLast(4);
        l.addLast(5);
        l.addLast(5);
        l.display();
        System.out.println("\n"+l.middle());
    }
}
