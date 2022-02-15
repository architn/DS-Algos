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
public class InOrderTraversal {
    
    static class Node{
        Node left;
        Node right;
        int data;
    }
    
    static Node NewNode(int data){
        Node node = new Node();
        node.data = data;
        node.right = null;
        node.left = null;
        return node;
    }
    
    
    static void InOrderTraversal(Node root){
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
                if(elements.isEmpty()){
                    break;
                }
                root = elements.pop();
                System.out.print(root.data+" ");
                root = root.right;
        }
    }
}
    
    public static void main(String[] args){
        Node root = NewNode(10);
        root.left = NewNode(11);
        root.right = NewNode(16);
        
        root.left.left = NewNode(2);
        root.left.right = NewNode(-1);
        
        root.right.left = NewNode(10);
        root.right.left.left = NewNode(9);
        root.right.left.right = NewNode(11);
        
        InOrderTraversal(root);

    }
    
}

