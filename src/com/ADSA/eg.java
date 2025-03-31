package com.ADSA;

public class eg {

    private Node head;
    private int size;
    public eg(){
        this.size = 0;
    }

    public void add(int val){
        Node n = new Node(val);
        n.next = head;
        head = n;
        size++;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + "->");
            temp=temp.next;
        }
        System.out.print("Null");
    }
    private static class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    private static Node fun(Node head, int n){
        Node f = head;
        Node s = head;
        for (int i = 0; i < n; i++) {
            if (f == null){
                return null;
            }
            f = f.next;
            while (f != null){
                f = f.next;
                s = s.next;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        eg l = new eg();
        l.add(5);
        l.add(4);
        l.add(3);
        l.add(2);
        l.add(1);
        l.display();
        System.out.println();
        System.out.println(l.fun(l.head,3));
    }
}
