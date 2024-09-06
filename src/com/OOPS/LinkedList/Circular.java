package com.OOPS.LinkedList;

public class Circular {

    private Node head;
    private Node tail;
    private int size;

    public Circular(){
        this.size = 0;
    }

    public void add(int val){
        Node node = new Node(val);
        if(head==null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
        size++;
    }

    public void delete(int val){
        Node temp = head;
        if(temp == null){
            return;
        }
        if(temp.data == val){
            head = head.next;
            tail.next = head;
        }
        do{
            Node n = temp.next;
            if(n.data == val){
                temp.next = n.next;
                break;
            }
            temp = temp.next;
        }while(temp != head);
    }


    public void print(){
        Node temp = head;
        if(head != null){
            do{
                System.out.print(temp.data + "-->");
                temp = temp.next;
            }while(temp != head);
        }
    }
    private class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
