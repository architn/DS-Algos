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
public class HeightOfBinaryTree {
    
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
    
    static int CalculateHeightOfBinaryTree(Node root){
        int height = 0;
        if (root == null) {
            return height;
        }
        height =  1 + Math.max(CalculateHeightOfBinaryTree(root.left), CalculateHeightOfBinaryTree(root.left));
        return height;
    }
    
    public static void main(String[] args){
        Node root = NewNode(2);
        root.left = NewNode(3);
        root.right = NewNode(4);
        
        root.left.left = NewNode(2);
        root.left.right = NewNode(5);
        
        root.right.left = NewNode(6);
        root.right.left.left = NewNode(7);
        
        System.out.println("Height of binary tree is: " +CalculateHeightOfBinaryTree(root));
    }
    
    
    
}
