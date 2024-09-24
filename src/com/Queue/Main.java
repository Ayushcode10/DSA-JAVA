package com.Queue;

import java.util.LinkedList;
import java.util.Queue;

/*
    Queue is an interface and not a class
    it implements Linked List
*/
public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1); //<-- head
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println(q.peek());//prints first element in the line
        System.out.println(q.remove());//removes the head, first element in the line

    }
}
