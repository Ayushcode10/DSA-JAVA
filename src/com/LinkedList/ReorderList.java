package com.LinkedList;

public class ReorderList {
    private Node head;
    private int size;

    public ReorderList() {
        this.size = 0;
    }

    public void add(int val){
        Node node = new Node(val);
        if (head == null){
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
            temp.next = node;
            size += 1;
    }

    public void reOrder(){
        if(head == null || head.next == null){
            return;
        }
        Node mid = Mid(head);
        Node h2 = rev(mid);
        Node h1 = head;
        while (h1 != null  && h2 != null){
            Node temp = h1.next;
            h1.next = h2;
            h1 = temp;

            temp = h2.next;
            h2.next = h1;
            h2 = temp;
        }
        if (h1 != null){
            h1.next = null;
        }
    }


    public Node rev(Node head){
        if (head == null){
            return head;
        }
        Node p = null;
        Node c = head;
        Node n = c.next;

        while (c != null){
            c.next = p;
            p = c;
            c = n;

            if(n != null){
                n = n.next;
            }
        }
        return p;
    }

    public Node Mid(Node head){
        Node f = head;
        Node s = head;
        while (f != null && f.next != null){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ReorderList l = new ReorderList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.display();
        System.out.println();
        l.reOrder();
        System.out.println();
        l.display();

    }
}
