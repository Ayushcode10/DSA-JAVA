package com.OOPS.LinkedList;

import java.lang.reflect.AnnotatedElement;
import java.util.spi.AbstractResourceBundleProvider;

public class LL {

    private Node head;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void addFirst(int val){
        Node deep = new Node(val);
        deep.next = head;
        head = deep;
        size++;
    }

    public int show(){
        return size;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.print("Null");
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.display();
        System.out.println("\n" + list.show());
    }
}