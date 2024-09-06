package com.LinkedList;

public class ClassQuestion {

        private Node head;
        private Node tail;
        private int size;

        public ClassQuestion(){
            this.size = 0;
        }

        public boolean isCyclic(){
            Node hare = head;
            Node tor = head;

            while(hare != null && hare.next != null){
                tor = tor.next;
                hare = hare.next.next;
                if (hare == tor){
                    return true;
                }
            }
            return false;
        }

        public int middle(){
            Node fast = head;
            Node slow = head;

            while (fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow.value;
        }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; // Complete the circular link
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // Complete the circular link
        }
        }
    public void addFirst(int val){
        //creating the new node to add
        Node node = new Node(val);
        //point the next of the newNode created to the node where head is pointing(first node)
        node.next = head;
        //update the head to the new node, since head always points to the first node
        head = node;

        //since we took a tail pointer
        if(tail == null){
            tail = head;
        }
        //increment the size by 1
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

    public void printList() {
        if (head == null) return;

        Node current = head;
        do {
            System.out.print(current.value + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }


    private class Node {
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
            ClassQuestion list = new ClassQuestion();
            list.addFirst(5);
            list.addFirst(4);
            list.addFirst(3);
            list.addFirst(2);
            list.addFirst(1);
            list.display();
            System.out.println("\nMiddle element is--> "+list.middle());
    }
}
