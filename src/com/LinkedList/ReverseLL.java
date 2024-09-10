package com.LinkedList;

public class ReverseLL {
    private Node head;
    private Node tail;
    private int size;

    public void addLast(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + "-->");
            temp = temp.next;
        }
        System.out.print("Null");
    }

    public void reverse(){
        if(head == null){
            return;
        }
        Node curr = head;
        Node prev = null;
        Node next = curr.next;

        while(curr.next != null){
            curr.next = prev;
            prev = curr;
            curr = next;

            if(next != null){
                next = next.next;
            }
        }
        head = prev;
    }
    private class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public ReverseLL(){
        this.size = 0;
    }

    public static void main(String[] args) {
        ReverseLL list = new ReverseLL();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.display();
        System.out.println();
        list.reverse();
        list.display();
    }

}
