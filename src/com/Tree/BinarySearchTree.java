package com.Tree;

public class BinarySearchTree {

    public BinarySearchTree(){

    }

    public class Node{
        int val;
        int height;
        Node l;
        Node r;

        public Node(int val){
            this.val = val;
        }

        public int getValue(){
            return val;
        }
    }
    private Node root;

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    private Node insert(int val, Node node){
        if(node == null){
            node = new Node(val);
            return node;
        }
        if (val < node.val){
            node.l = insert(val, node.l);
        }
        if (val > node.val){
            node.r = insert(val, node.r);
        }
        node.height = Math.max(height(node.l), height(node.r)) + 1;
        return node;
    }

    public boolean balanced(Node node){
        if (node == null){
            return true;
        }
        return Math.abs(height(node.l) - height(node.r)) <= 1 && balanced(node.l) && balanced(node.r);
        
    }

    public void display(){
        display(root, "Root Node: ");
    }
    private void display(Node node, String details){
        if (node == null){
            return;
        }
        System.out.println(details + node.getValue());
        display(node.l, "Left child of " + node.getValue() + " : ");
        display(node.r, "right child of " + node.getValue() + " : ");

    }
}
