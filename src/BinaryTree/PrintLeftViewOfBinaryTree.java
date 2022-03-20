/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree;

import static BinaryTree.SumOfAllNodes.NewNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author architnigam
 */
public class PrintLeftViewOfBinaryTree {
    
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
    
    static List<Integer> printLeftViewOfTree(Node node){
        List<Integer> leftElementsOfBinaryTree = new ArrayList<>();
        Stack<Node> elements = new Stack<>();
        while(node != null){
             leftElementsOfBinaryTree.add(node.left.data);
             elements.push(node.left);
             node = node.left;
             if(node.left == null){
                 node = elements.pop();
                 node = node.right;
                 printLeftViewOfTree(node);
             }
        }
        return leftElementsOfBinaryTree;
    }
    
    
    public static void main(String[] args){
        Node root = NewNode(20);
        root.left = NewNode(5);
        root.right = NewNode(3);
        
        root.left.left = NewNode(15);
        root.left.right = NewNode(30);
        
        root.right.left = NewNode(40);
        root.right.right = NewNode(25);
                
                
        List<Integer> leftView = printLeftViewOfTree(root);
        for(int data : leftView){
            System.out.print(data+" ");
        }
    }
}
