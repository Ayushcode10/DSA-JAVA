package com.LinkedList;

public class ReverseBetween extends LinkedList{
    public ReverseBetween() {
        super();
    }
    public ReverseBetween(int val) {
        super();
    }
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

    public Node reverseBetween(Node node, int left, int right){
        if(left == right){
            return head;
        }

        Node curr = head;
        Node prev = null;

        for (int i = 0; curr!= null && i <left-1 ; i++) {
            prev = curr;
            curr= curr.next;
        }
        Node last = prev;
        Node newEnd = curr;

        //rev between left and right
        Node next = curr.next;
        for (int i = 0; curr!=null && i < right-left+1; i++) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next!=null) {
                next = next.next;
            }
        }
        if(last != null){
            last.next = prev;
        }
        else {
            head = prev;
        }
        newEnd.next = curr;
        return head;

    }

    public static void main(String[] args) {
        ReverseBetween l = new ReverseBetween();
        l.addLast(1);
        l.addLast(2);
        l.addLast(3);
        l.addLast(4);
        l.addLast(5);
        l.display();
        l.reverseBetween(l.head,2,4);
        System.out.println();
        l.display();
    }

}
