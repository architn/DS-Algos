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
public class FindMaxDigitInBinaryTree {
    
    static class Node{
        int data;
        Node left;
        Node right;
    }
    
    static Node NewNode(int data){
        Node node = new Node();
        node.data = data;
        node.left = null;
        node.right = null;
        return node;
    }
    
    static void MaxDigitInTree(Node root){
        int max = Integer.MIN_VALUE;
        if(root == null)
            return;
        Stack<Node> elements = new Stack<>();

        while(true){
            if(root != null){
                elements.push(root);
                max = Math.max(max, root.data);
                root = root.left;
            }
            else{
                if(elements.isEmpty()){
                    break;
                }
               root = elements.pop();
               root = root.right;
            }
        }
        
        System.out.println("Max Number in Binary Tree is: "+max);
    }
    
    public static void main(String[] args){
        Node root = NewNode(4);
        root.left = NewNode(2);
        root.right = NewNode(7);
        
        root.left.left = NewNode(1);
        root.left.right =  NewNode(3);
        
        root.right.left = NewNode(6);
        root.right.right = NewNode(10);
        
        MaxDigitInTree(root);
    }
}
