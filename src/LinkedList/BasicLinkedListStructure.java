/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author architnigam
 */
public class BasicLinkedListStructure {
    
    static class Node{
        Node next;
        int data;
        
        public Node(int data){
            this.data = data;
        }

        public class LinkedList{
            Node head;
            
        public void append(int data){
                if(head == null){
                    head = new Node(data);
                    return;
                }
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = new Node(data);
        }
        // Creat
        public void prepend(int data){
            Node newHead = new Node(data);
            newHead.next = head;
            head = newHead;
        }
    }
}
    
}
