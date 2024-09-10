package com.LinkedList;

public class SortList {
    //pointers
    private Node head;
    private Node tail;
    //maintains the size of the list
    private int size;

    public SortList() {
        //initialise the size with 0
        this.size = 0;
    }


    // Main method to sort the list
//    public Node sortList(Node head) {
//        // Base case: if the list is empty or has only one element
//        if (head == null || head.next == null) {
//            return head;
//        }
//
//        // Get the middle of the list
//        Node mid = getMid(head);
//        Node left = head;
//        Node right = mid;
//
//        // Split the list into two halves and sort each half
//        mid = null; // Split the list into two halves
//        left = sortList(left);
//        right = sortList(right);
//
//        // Merge the two sorted halves
//        return merge(left, right);
//    }

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
            if (left.value < right.value) {
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

//     Node merge(Node l1 , Node l2){
//        Node dummy = new Node();
//        Node tail = dummy;
//        while (l1 != null && l2 != null){
//            if (l1.value < l2.value){
//                tail.next = l1;
//                l1 = l1.next;
//                tail = tail.next;
//            }
//            else{
//                tail.next = l2;
//                l2 = l2.next;
//                tail = tail.next;
//            }
//        }
//        tail.next = (l1 != null)? l1 : l2;
//        return dummy.next;
//    }

//    Node getMid(Node head){
//        Node slow = head;
//        Node fast = head;
//        while(fast != null &&  fast.next != null){
//            slow = slow.next;
//            fast = fast.next;
//        }
//        return slow;
//    }

    public Node sortList(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node mid = getMid(head);
        Node left = sortList(head);
        Node right = sortList(mid);

        return merge(left, right);
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


    private static class Node{
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

        public Node() {

        }
    }

    public static void main(String[] args) {
        gpt l = new gpt();
        l.addLast(1);
        l.addLast(4);
        l.addLast(3);
        l.addLast(2);
        l.addLast(5);

        l.display();
//        System.out.println("\n"+l.getMid(l.head).value);
//        l.sortList(l.head);
    }
}
