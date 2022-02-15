/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree;

/**
 *
 * @author architnigam
 */
public class SumOfAllNodes {
    
   static class  Node{
        int data;
        Node left;
        Node right;
    }
    
    
    static Node NewNode(int data){
        Node node = new Node();
        node.data = data;
        node.right = null;
        node.right = null;
        return node;
    }
    
    static int sumOfAllNodes(Node root){
        int sum = 0;
        if(root == null){
            return sum;
        }
        sum = root.data + sumOfAllNodes(root.left) + sumOfAllNodes(root.right);
        return sum;
    }
    
    public static void main(String[] args){
        Node root =  NewNode(20);
        root.left = NewNode(5);
        root.right = NewNode(3);
        
        root.left.left = NewNode(15);
        root.left.right = NewNode(30);
        
        root.right.left = NewNode(40);
        root.right.right = NewNode(25);
        
        int sumOfAllNodes = sumOfAllNodes(root);
        System.out.println("Sum of all elements of binary tree is: " +sumOfAllNodes);
    }
    
    
    
}
