package com.ADSA;


import java.nio.file.NotDirectoryException;

public class LLpractice {

    private Node head ;
    private int size;
    public LLpractice(){
        this.size = 0;
    }

    public void addFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        size++;
    }

    public void addLast(int val){
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
    }

    public boolean cycle(){
        if (head == null){
            return false;
        }
        Node f = head;
        Node s = head;
        while (f!=null && f.next!=null){
            s = s.next;
            f = f.next.next;
            if (s == f){
                return true;
            }
        }
        return false;
    }

    public Node mergeList(Node l1, Node l2){
        Node dummy = new Node();
        Node tail = dummy;

        while (l1 != null && l2 != null){
            if (l1.val<l2.val){
                tail.next = l1;
                l1 = l1.next;
            }
            else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;

            if (l1!=null){
                tail.next= l1;
            }
            else if (l2!=null){
                tail.next = l2;
            }
        }
        return dummy.next;
    }
    public int middle(){
        if (head == null){
            return -1;
        }
        Node f = head;
        Node s = head;
        while (f!= null && f.next != null){
            s = s.next;
            f = f.next.next;
        }
        return s.val;
    }
    public void reverse(){
        if(head == null){
            return;
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
        head = p;
    }

    public void insert(int val, int index){
        if (head == null ){
            addFirst(val);
            return;
        }
        if (index == size){
            addLast(val);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;

    }

    public static class Node{
        Node next;
        int val;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }

        public Node() {

        }
    }

    public static void main(String[] args) {
        LLpractice ll = new LLpractice();

    }
}
