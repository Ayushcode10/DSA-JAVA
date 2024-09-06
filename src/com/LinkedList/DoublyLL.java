package com.LinkedList;

public class DoublyLL {

    private Node head;
    private Node tail;
    private int size;

    public DoublyLL(){
        this.size = 0;
    }


    public void insert(int value, int index){
        if (head == null){
            addFirst(value);
            return;
        }
        if(size == index){
            AddLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value,temp.next,temp.prev);
        node.prev = temp;
        node.next = temp.next;
        temp.next.prev = node;
        temp.next = node;
        size++;
    }


    //insert using recursion
    public void Insert(int val) {

    }
    public int deleteFirst(){
        if (head == null){
            System.out.println("empty list");
            return -1;
        }
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public int delete(int index){
        if (head == null){
            System.out.println("empty list");
            return -1;
        }
        Node before = getNode(index - 1);
        //[] = [] = [] = [] = null
        int val = before.next.value;
        before.next = before.next.next;
        before.next.next.prev = before;
        return val;
    }
    public int deleteLast(){
        if (head == null){
            System.out.println("empty list");
            return -1;
        }
        Node S = getNode(size-2);
        int val = S.next.value;
//        S.prev = S;
        S.next = null;
        return val;

    }

    public Node getNode(int index){
        Node temp = head;
        for (int i = 0; i <index ; i++) {
            temp = temp.next;
        }
        return temp;
    }
    //without the tail pointer
    public void AddLast(int val){

        //checking Null pointer exception
        if(head == null){
            addFirst(val);
            return;
        }
        //temp node for traversal
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        //create a newNode
        Node node = new Node(val);
        //prev of node will point to the last node
        node.prev = temp;
        //next of temp will point to the newNode
        temp.next = node;
        //next of newNode will point to null
        node.next = null;
        size++;
    }

    public void addFirst(int val){
        //create a new node
        Node node = new Node(val);
        //make the next pointer of the newNode point to the head
        node.next = head;
        //and the prev pointer point to null since it will be the first node
        node.prev = null;
        //checking nullPointer exception
        if (head != null){
            //do this only if head is not null, if we are not adding for the first time
            head.prev = node;
        }
        //make the head point to the new node
        head = node;
        //increment the size
        size++;
    }

    public void reverseLL(){
        Node temp = head;
        Node last = temp;
        while(temp!=null){
            last = temp;
            temp = temp.next;

        }
        while(last != null){
            System.out.print(last.value+ " --> ");
            last = last.prev;
        }
        System.out.print("START");
    }

    public int Size(){
        return size;
    }

    public void display(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        Node last = null;
        while(temp != null){
            System.out.print(temp.value + " <--> ");
            last = temp;
            temp = temp.next;
        }
        System.out.print("Null");
    }
    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
