package com.LinkedList;

public class ReverseKgroups extends LinkedList{

    private Node head;
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


    public ReverseKgroups() {
        super();
    }

    public ReverseKgroups(int val){
        super();
    }

//    public Node rev(Node head){
//        if (head == null){
//            return head;
//        }
//    }

    public static void main(String[] args) {
        ReverseKgroups l = new ReverseKgroups();
        l.addLast(1);
        l.addLast(1);
        l.addLast(2);
        l.addLast(1);
        l.reverse();
        l.display();
    }
}
