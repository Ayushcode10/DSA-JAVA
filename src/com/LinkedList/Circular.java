package com.LinkedList;

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

    //cycle detection method
    //fast and slow pointer method
    public boolean isCyclic(){

        Node fast = head;
        Node slow = head;
        while(fast != null & fast.next != null){
            //this pointer will iterate one-by-one
            slow = slow.next;
            //this pointer will iterate two-by-two
            fast = fast.next.next;

            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    //find length of cycle
    public int lengthOfCycle(){

        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                int len = 0;
                Node temp = slow;
                do{
                    temp = temp.next;
                    len++;
                }while (temp != slow);
                return len;
            }
        }
        return 0;
    }

    //detect cycle and tell where it's starting
    public Node detectCycle(Node head) {
        int length = 0;
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                length = lengthOfCycle();
                break;
            }
            return null;
        }
        Node p1 = head;
        Node p2 = slow;
        while(p1 != p2){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }

    public void print() {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.data + "-->");
                temp = temp.next;
            } while (temp != head);
        }
    }

    public static void main(String[] args) {
        Circular list = new Circular();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        list.print();
        System.out.println();
        System.out.println(list.isCyclic());
        System.out.println(list.lengthOfCycle());
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
