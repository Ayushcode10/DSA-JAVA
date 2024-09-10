package com.LinkedList;

public class gpt {
    private Node head;
    private Node tail;
    //maintains the size of the list
    private int size;

    public gpt(){
        this.size = 0;
    }

    public void addLast(int val){
        Node node = new Node(val);
        if (head == null){
            head = node;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next= node;
        size += 1;

    }

    public void display(){
        //create a temp pointer which points to the node where head is pointing
        //i.e the first node
        Node temp = head;

        //iterate the temp through the LL till the node != null
        while(temp != null){
            //print the node's value
            System.out.print(temp.value + " -> ");
            //update the temp to the next node
            temp = temp.next;
        }
        System.out.print("Null");
    }


    public static void main(String[] args) {
        gpt l = new gpt();
        l.addLast(1);
        l.addLast(4);
        l.addLast(3);
        l.addLast(2);
        l.display();
    }
    // Main method to sort the list
    public Node sortList(Node head) {
        // Base case: if the list is empty or has only one element
        if (head == null || head.next == null) {
            return head;
        }

        // Get the middle of the list
        Node mid = getMid(head);
        Node left = head;
        Node right = mid;

        // Split the list into two halves and sort each half
        mid = null; // Split the list into two halves
        left = sortList(left);
        right = sortList(right);

        // Merge the two sorted halves
        return merge(left, right);
    }

    // Function to get the middle of the list
    private Node getMid(Node head) {
        if (head == null) return null;

        Node slow = head;
        Node fast = head;
        Node prev = null;

        // Move fast by 2 steps and slow by 1 step
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Disconnect the first half from the second half
        if (prev != null) {
            prev.next = null;
        }

        return slow;
    }

    // Function to merge two sorted lists
    private Node merge(Node left, Node right) {
        // Create a dummy node to act as the start of the merged list
        Node dummy = new Node(0);
        Node current = dummy;

        // Merge the two lists
        while (left != null && right != null) {
            if (left.val < right.val) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }

        // Append the remaining nodes of left or right
        if (left != null) {
            current.next = left;
        } else {
            current.next = right;
        }

        // The sorted list starts from dummy.next
        return dummy.next;
    }

    public class Node {
        int value;
        int val;
        Node next;
        Node() {}
        Node(int val) { this.val = val; }
        Node(int val, Node next) { this.val = val; this.next = next; }
    }

}
