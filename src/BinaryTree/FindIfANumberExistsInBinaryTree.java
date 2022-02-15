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
public class FindIfANumberExistsInBinaryTree {
    
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
    
    static boolean DoesValueExistInNode(Node root, int value){
        if(root == null){
            return false;
        }
        Stack<Node> elements = new Stack<>();
        while(true){
            if(root!=null){
                elements.push(root);
                if(root.data == value){
                    return true; 
                }
                else{
                    root = root.left;
                }
            }
                else{
                    if(elements.isEmpty()){
                        break;
                    }
                    root = elements.pop();
                    root = root.right;
                }
            }
        return false;
    }
    
    public static void main(String[] args){
        Node root = NewNode(1);
        root.left = NewNode(7);
        root.right = NewNode(9);
        
        root.left.left = NewNode(2);
        
        root.left.right = NewNode(6);
        
        root.left.right.left = NewNode(5);
        root.left.right.right = NewNode(11);
        
        root.right.right = NewNode(9);
        root.right.right.left = NewNode(5);
        boolean result = DoesValueExistInNode(root, 50);
        System.out.println(result);
    }
}
