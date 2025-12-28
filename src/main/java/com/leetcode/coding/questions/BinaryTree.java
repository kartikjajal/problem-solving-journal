package com.leetcode.coding.questions;

public class BinaryTree {

    private Node root;

    public BinaryTree(int data) {
        this.root = new Node();
        this.root.data=data;
    }

    class Node {
        int data;
        Node left;
        Node right;

        Node() {
            this.data=data;
        }

        Node(int data) {
            this.data=data;
        }
    }

    public void insert(int data) {
        addRecursive(root, data);
    }

    public Node addRecursive(Node node, int data) {
        if(node==null) {
            return new Node(data);
        }

        if(data>node.data) {
           node.right=addRecursive(node.right, data);
        } else if(data<node.data){
            node.left=addRecursive(node.left, data);
        }
        return node;
    }

    public void traverse(Node node) {
        if(node!=null) {
            System.out.println(node.data);
            traverse(node.left);
            traverse(node.right);
        }
    }

    public boolean isValueFound(Node node,int value) {
        if(node==null)
            return false;

        if (node!=null && node.data==value) {
            return true;
        }

        if(value<node.data)
            return isValueFound(node.left, value);
        else
            return isValueFound(node.right, value);
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree(10);
        bt.insert(4);
        bt.insert( 5);
        bt.insert( 7);
        bt.insert( 9);
        bt.insert(15);
        bt.traverse(bt.root);

        System.out.println(bt.isValueFound(bt.root, 15));
    }
}
