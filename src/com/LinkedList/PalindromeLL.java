package com.LinkedList;

public class PalindromeLL {

    private Node head;
    private int size;
    public PalindromeLL(){
        this.size = 0;
    }

    private class Node{
        //contains the value
        private int value;
        //pointer to the next Node
        //this is a ref var of type node because it's pointing to something which is type node
        private Node next;

        //constructor for value as an input
        public Node(int value){
            this.value = value;
        }

        //constructor for value and a Node as an input
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public boolean isPalindrome(Node head){
        Node mid = findMid(head);
        Node headSecond = reverse(mid);
        Node reReverse = headSecond;

        //compare both the halves:
        while(head != null &&  headSecond != null){
            if(head.value != headSecond.value){
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverse(reReverse);

        return head == null || headSecond == null;
    }

    public Node reverse(Node head){
        if(head == null){
            return head;
        }

        Node prev = null;
        Node curr = head;
        Node next = curr.next;

        while(curr != null){
            curr.next = prev;
            prev = curr;
            curr = next;

            if (next != null){
                next =  next.next;
            }
        }
        head = prev;
        return head;
    }

    public void addLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
            temp.next = node;
            size += 1;
    }
        public void display(){
            //create a temp pointer which points to the node where head is pointing
            //i.e the first node
            Node temp = head;

            //iterate the temp through the LL till the node != null
            while (temp != null) {
                //print the node's value
                System.out.print(temp.value + " -> ");
                //update the temp to the next node
                temp = temp.next;
            }
            System.out.print("Null");

    }

    public static void main(String[] args) {
        PalindromeLL l = new PalindromeLL();
        l.addLast(1);
        l.addLast(2);
        l.addLast(3);
        l.addLast(2);
        l.addLast(1);
        l.display();
        System.out.println();
        System.out.println("is the list a Palindrome?? "+l.isPalindrome(l.head));
    }

}
