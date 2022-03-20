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
public class BasicBinaryTree {
    
    static class Node{
        Node left;
        Node right;
        int data;
    }
    
    static Node createNode(int data){
        Node node = new Node();
        node.left = null;
        node.right = null;
        node.data = data;
        return node;
    }
    
    static void printBinaryTree(Node root){
        if(root == null){
            return;
        }
        Stack<Node> elements = new Stack<>();
        while(true){
            if(root!=null){
                elements.push(root);
                root = root.left;
            }
            else{
                if(elements.empty()){
                    break;
                }
                else{
                    root = elements.pop();
                    System.out.print(root.data+" ");
                    root = root.right;
                }
            }
        }
        
    }
    
    
    
    public static void main(String[] args) {
        Node root =  createNode(4);
        root.left = createNode(2);
        root.right = createNode(5);
        
        root.left.left = createNode(1);
        root.left.right = createNode(3);
        
        root.right.right = createNode(6);
        
        printBinaryTree(root);
    }
    
}
