package com.LinkedList;

public class deleteDuplicates {
    //given a sorted linked list, delete all the duplicate elements
        Node head;
        Node tail;
        int size;
    public deleteDuplicates(){
        this.size = 0;
    }

    public void add(int val){
        Node node = new Node(val);
        node.next= head;
        head = node;
        size++;
    }

    //method to delete duplicate elements
    //O(N) complexity, because we are traversing the list
    public void DeleteDuplicates(){
        //create a temp iterator to traverse the list
        Node temp = head;
        //loop runs till the next link of the last element points to null
        while(temp.next != null){
            //check if the value of two consecutive elements are equal
            if(temp.data == temp.next.data){
            //if equal, break the link and make the next link of the node to point to the
            //node after the equal node
                temp.next = temp.next.next;
                //decrease the size if breaking the link
                size--;
            }
            else {
                //if not equal, simply update the iterator
                temp = temp.next;
            }
        }
        //after temp reaches last element, make the tail point to it
        tail = temp;
        //the next link of the tail node will always point to null
        tail.next = null;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.print("Null");
    }

    public static void main(String[] args) {
        deleteDuplicates list = new deleteDuplicates();
        list.add(3);
        list.add(2);
        list.add(2);
        list.add(1);
        list.add(1);
        list.print();
        System.out.println("\nAfter Removing duplicate values-->");
        list.DeleteDuplicates();
        list.print();
    }
    private class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
