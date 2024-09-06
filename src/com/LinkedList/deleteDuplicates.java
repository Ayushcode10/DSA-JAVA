package com.LinkedList;

public class deleteDuplicates {
    //given a sorted linked list, delete all the duplicate elements
        Node head;
        Node tail;
        int size;
    public deleteDuplicates(){
        this.size = 0;
    }

    public void add(int val){
        Node node = new Node(val);
        node.next= head;
        head = node;
        size++;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.print("Null");
    }

    public static void main(String[] args) {
        deleteDuplicates list = new deleteDuplicates();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.print();
    }
    private class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
