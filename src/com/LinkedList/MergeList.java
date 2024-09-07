package com.LinkedList;

public class MergeList {

    //Merge two Sorted lists in a sorted manner
    Node head;
    Node tail;
    int size;
    public MergeList(){
        this.size = 0;
    }

    public static MergeList Merge(MergeList first, MergeList second){
        Node f = first.head;
        Node s = second.head;
        MergeList list = new MergeList();
        while(f != null && s != null){
            if (f.data<s.data){
                list.addLast(f.data);
                f = f.next;
            }
            else{
                list.addLast(s.data);
                s = s.next;
            }
        }
        while(f!=null){
            list.addLast(f.data);
            f = f.next;
        }
        while(s!=null){
            list.addLast(s.data);
            s = s.next;
        }

        return list;
    }
    public static MergeList mergee(MergeList first,MergeList sec){
        Node f = first.head;
        Node s = sec.head;
        MergeList list = new MergeList();
        while(f != null && s!= null){
            if (f.data < s.data){
                list.addLast(f.data);
                f = f.next;
            }
            else {
                list.addLast(s.data);
                s = s.next;
            }
        }
        while(f!=null){
            list.addLast(f.data);
            f = f.next;
        }
        while(s!=null){
            list.addLast(s.data);
            s = s.next;
        }
        return list;

    }

    public void add(int val){
        Node node = new Node(val);
        node.next= head;
        head = node;
        size++;
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
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.print("Null");
    }

    public static void main(String[] args) {
        MergeList list1 = new MergeList();
        list1.addLast(1);
        list1.addLast(3);
        list1.addLast(5);

        MergeList list2 = new MergeList();
        list2.addLast(1);
        list2.addLast(2);
        list2.addLast(9);
        list2.addLast(14);

        list1.print();
        System.out.println();
        list2.print();
        System.out.println("\nmerged sorted list-->>");
        MergeList list = MergeList.mergee(list1, list2);
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
