/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree;

import java.util.Stack;

/**
 *
 * @author architnigam
 */
public class InvertABinaryTree {
    
    
    static class Node{
        Node left;
        Node right;
        int data;
    }
    
    static Node NewNode(int data){
        Node node = new Node();
        node.data = data;
        node.left = null;
        node.right = null;
        return node;
    }
    
    static Node invertBinaryTree(Node root){
        if(root == null){
            return root;
        }
        
        Node left = invertBinaryTree(root.left);
        Node right = invertBinaryTree(root.right);
        
        root.left = right;
        root.right = left;
        return root;
    }
    
    static void printBinaryTree(Node root){
        if(root == null){
            return;
        }
        
        Stack<Node> elements = new Stack<>();
        while(true){
            if(root !=null){
                elements.push(root);
                root = root.left;
            }
            else{
                if(elements.isEmpty()){
                    break;
                }
                root = elements.pop();
                System.out.print(" "+root.data);
                root = root.right;
            }
        }
    }
    
    public static void main(String[] args){
        Node root = NewNode(2);
        root.left = NewNode(1);
        root.right = NewNode(4);
        
        root.right.left = NewNode(3);
        root.right.right = NewNode(5);
        
        System.out.println("In order traversal before inverting:");
        printBinaryTree(root);
        System.out.println("");
        
        Node invertedTree = invertBinaryTree(root);
        System.out.println("In order traversal after inverting:");
        printBinaryTree(invertedTree);
        System.out.println("");
    }
}
