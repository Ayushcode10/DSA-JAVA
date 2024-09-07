package com.LinkedList;

import javax.sound.sampled.Line;

public class Main {
    public static void main(String[] args) {

//        LL2 list = new LL2();
//        list.addFirst(1);
//        list.addLastWithTail(2);
//        list.addLastWithTail(3);
//        list.addLastWithTail(4);
//        list.insert(20,3);
//        list.display();
//
//        LL list = new LL();
//        list.addLast(3);
//        list.addLast(4);
//        list.addFirst(2);
//        list.addFirst(1);
//        list.addLast(5);
//        list.add(20,3);
//        System.out.println(list.deleteFirst());
//        System.out.println(list.deleteLast());
//        System.out.println(list.delete(3));
//        list.display();
//        System.out.println(list.size());
//
//        DoublyLL list = new DoublyLL();
////        list.addFirst(5);
//        list.AddLast(6);
//        list.addFirst(4);
//        list.addFirst(3);
//        list.addFirst(2);
//        list.addFirst(1);
//        list.insert(19,3);
////        list.addLast(1);
////        list.addLast(4);
////        System.out.println(list.deleteFirst() + "is deleted");
//        list.display();
////        System.out.println("\nin reverse\n");
////        list.reverseLL();
//        System.out.println(" \nsize of ll is: "+ list.Size());
//        LinkedList list = new LinkedList();
//        list.addFirst(4);
//        list.addFirst(3);
//        list.addFirst(2);
//        list.addFirst(1);
//        list.reverse();
//        list.display();

        LinkedList l = new LinkedList();
        l.addFirst(1);
        l.addLast(2);
        l.addLast(3);
        l.addLast(4);
        l.addLast(5);
        l.display();
        System.out.println();
        System.out.println(l.removeNthFromEnd(3));
        l.display();
//        Circular ll = new Circular();
//        ll.add(1);
//        ll.add(2);
//        ll.add(3);
//        ll.add(4);
//        ll.delete(3);
//        ll.print();
    }
}
