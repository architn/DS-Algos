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
public class InsertElementsInBinaryTree {
    static class Node{
        static Node left;
        static Node right;
         static int data;
    
    
    static Node createNode(int data){
        Node node = new Node();
        node.left = null;
        node.right = null;
        node.data = data;
        return node;
    }
    static void insertElementInBinaryTree(int value){
        if(value <= data){
            if(left == null){
                createNode(value);
            }
            else{
                insertElementInBinaryTree(value);
            }
        }
        else{
            if(right == null){
                createNode(value);
            }
            else{
                insertElementInBinaryTree(value);
            }
        }
    }
    static void printBinaryTree(Node root){
        if(root == null){
            return;
        }
        Stack<Node> elements = new Stack<>();
        while(true){
            if(root != null){
                elements.push(root);
                root = root.left;
            }
            else{
                if(elements.empty()){
                    break;
                }
                root = elements.pop();
                System.out.print(root.data+" ");
                root = root.right;
            }
        }
    }
    public static void main(String[] args) {
        Node root = createNode(10);
        root.left = createNode(5);
        root.right = createNode(15);
        insertElementInBinaryTree(7);
        printBinaryTree(root);
    }
    
    }  
}
