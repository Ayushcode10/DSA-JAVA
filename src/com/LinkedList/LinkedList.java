package com.LinkedList;

public class LinkedList {

    //pointers
    private Node head;
    private Node tail;
    //maintains the size of the list
    private int size;

    public LinkedList(){
        //initialise the size with 0
        this.size = 0;
    }


    /*
        adding the node at the first index:-
        1) newNode.next --> head
        2) head --> newNode
    */
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

    /*
        Adding at the Last index using tail pointer:-
        1)tail.next --> node, point the next pointer of the last index to the newNode
        2)tail --> node, update the tail to the newNode at the last
    */
    public void addLastWithTail(int val){
        Node node = new Node(val);
        if (tail == null){
            addFirst(val);
            return;
        }
        tail.next = node;
        tail = node;
        size += 1;
    }


    /*  Adding a Node at the last index
        1)iterate through the loop until the next pointer of the last node points at null
            temp.next --> null ? break the loop
        2)make the next pointer of the last node point to the newNode
            temp.next --> newNode
    */
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

    /*
        Adding the node at nth index:-
        1)iterate with the temp pointer to (index-1)index
        2)we will need to pass the next of new node to which it will point
            node --> temp.next
            Node(val, temp.next)
        3)now temp is at index-1 then
            temp.next --> node
    */
    public void insert(int val, int index){
        if(head == null){
            addFirst(val);
            return;
        }
        if(index == size){
            addLastWithTail(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next); // this is the same as node.next --> temp.next
        temp.next = node;
        size++;
    }

    //delete the first node
    //make the head point to the head.next node [head --> head.next]
    //and the previous node will automatically be removed
    public int deleteFirst(){
        int val = head.value;
        //head --> head.next;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    //this method returns the reference Node containing the target value
    public Node find(int val){
        //node for traversing
        Node temp = head;
        while (temp != null){
            if (temp.value == val){
                return temp;
            }
            temp = temp.next;
        }
        //if not found
        return null;
    }
    //this method returns the reference of the node at a particular index
    public Node getNode(int index){
        //make a node to traverse
        Node temp = head;
        //traverse till index - 1;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public int getVal(int index){
        //make a node to traverse
        Node temp = head;
//        traverse till index;
        for (int i = 0; i <=index; i++) {
            temp = temp.next;
        }
        return temp.value;
    }

    /*
        delete the Last index:-
        1)traverse till the secondLast node using the getNode(index), where index is size -2
            as size=index+1
        2)make the tail point to the node
    */
    public int deleteLast(){
        //if there is only one node
        if(size<=1){
            deleteFirst();
        }
        //traversing to the second last node
        Node secondLast = getNode(size-2);
        //get the value
        int val = tail.value;
        //make the tail point to the second last index
        tail = secondLast;
        //make the next pointer of the secondLast node to null
        tail.next = null;
        //return the deleted value
        return val;
    }

    public int deleteAtIndex(int index){
        if(index == 0){
            deleteFirst();
        }
        if(size == index -1){
            deleteLast();
        }
        //get to the index -1 node
        Node prev = getNode(index - 1);
        //get the value
        int val = prev.next.value;
        //make the next pointer of the prev node point to the index+1 node
        prev.next = prev.next.next;
        //return the deleted value
        return val;
    }

    public void reverse(){
        if (size<2){
            return;
        }

        if(head == null){
            return;
        }

        Node prev = null;
        Node curr = head;
        Node next = curr.next;

        while(curr != null){
            curr.next = prev;
            prev = curr;
            curr = next;
            if (next != null){
                next = next.next;
            }
        }
            head = prev;
    }

    public Node reverseBetween(Node node, int left, int right){
        if(left == right){
            return head;
        }

        Node curr = head;
        Node next = curr.next;
        Node prev = null;

        for (int i = 0; curr!= null && i <left-1 ; i++) {
            prev = curr;
            curr= curr.next;
        }
        Node last = prev;
        Node newEnd = curr;

        //rev between left and right

        return head;
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

    //creating a Node
    private static class Node{
        //contains the value
        private final int value;
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
}