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
public class BreadthFirstSearch {
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
    
    public static void main(String[] args) {
        Node node = createNode(0);
        node.left = createNode(1);
        //node,right
    }
    
    
}
