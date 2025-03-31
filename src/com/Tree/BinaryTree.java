package com.Tree;

import java.util.Scanner;

public class BinaryTree {

    public BinaryTree(){

    }

    private static class Node{
        int val;
        Node left;
        Node right;

        public Node(int  val){
            this.val = val;
        }
    }

    private Node root;

    //insert elements
    public void populate(Scanner sc){
        System.out.println("enter the root node value: ");
        int val = sc.nextInt();
        root = new Node(val);
        populate(sc, root);
    }

    private void populate(Scanner sc , Node node){
        System.out.println("do you want to enter left of " + node.val);
        boolean left = sc.nextBoolean();
        if (left){
            System.out.println("Enter the val: ");
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }
        System.out.println("do you want to enter right of " + node.val);
        boolean right = sc.nextBoolean();
        if (right){
            System.out.println("Enter the val: ");
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }
    }

    public void display(){
        display(root, "");
    }

    public void prettyDisplay(){
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level){
        if (node==null){
            return;
        }
        prettyDisplay(node.right, level+1);

        if (level != 0){
            for (int i = 0; i < level-1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|----->" + node.val);
        }
        else {
            System.out.println(node.val);
        }
        prettyDisplay(node.left,level+1);
    }
    private void display(Node node, String indent){
        if (node == null){
            return;
        }
        System.out.println(indent + node.val);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        bt.populate(sc);
        bt.prettyDisplay();
    }
}
