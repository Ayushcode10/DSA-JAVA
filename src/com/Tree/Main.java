package com.Tree;

import java.util.Scanner;

public class Main{

    public Main(){

    }

  public static class Node{
        Node r;
        Node l;
        int val;

        public Node(int v){
            this.val = v;
        }
  }
  private Node root;

    public void populate(Scanner sc){
        System.out.println("enter root");
        int val = sc.nextInt();
        root = new Node(val);
        populate(sc,root);
    }

    public void populate(Scanner sc, Node node){
        System.out.println("to l?" + node.val);
        boolean l = sc.nextBoolean();
        if(l){
            System.out.println("enter val");
            int v = sc.nextInt();
            node.l = new Node(v);
            populate(sc,node.l);
        }
        System.out.println("to r?" + node.val);
        boolean r = sc.nextBoolean();
        if(r){
            System.out.println("enter val");
            int v = sc.nextInt();
            node.l = new Node(v);
            populate(sc,node.r);
        }
    }
}