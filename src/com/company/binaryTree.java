package com.company;

public class binaryTree {
    Node root;
    //count number of nodes
    int countNumberOfNodes(Node root){
        if (root==null){
            return 0;
        }
        return (1+countNumberOfNodes(root.left)+countNumberOfNodes(root.right));
    }
    boolean checkComplete(Node root,int index,int numberOfNodes){
        //check if tree is empty
        if (root==null){
            return true;
        }
        if (index>=numberOfNodes){
            return false;
        }
        return checkComplete(root.left,2*index+1,numberOfNodes)&&checkComplete(root.right,2,numberOfNodes);

    }
    public static void main(String[] args){
        binaryTree b=new binaryTree();
        b.root=new Node(1);
        b.root.left=new Node(2);
        b.root.right=new Node(3);
        b.root.left.right=new Node(5);
//        b.root.left.left=new Node(4);
        b.root.right.left=new Node(6);
        int node_count = b.countNumberOfNodes(b.root);
        int index = 0;

        if (b.checkComplete(b.root, index, node_count))
            System.out.println("The tree is a complete binary tree");
        else
            System.out.println("The tree is not a complete binary tree");
    }

}
class Node{
    int data;
    Node left,right;
    Node (int item){
        data=item;
        left=right=null;
    }
}
