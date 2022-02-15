/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

import java.util.LinkedList;

/**
 *
 * @author architnigam
 */
public class LinkedListPractice {
    
    public void addTwoLinkedLists(LinkedList<Integer> l1, LinkedList<Integer> l2)
    {
        int number1 = 0;
        int number2 = 0;
        int power1 = l1.size() - 1;
        int power2 = l1.size() - 1;
        for(int index = 0; index < l1.size(); index++)
        {
            number1 += (int) (l1.get(index)*(Math.pow(10, power1)));
            power1--;
        }
        System.out.println(number1);

        for(int index = 0; index < l2.size(); index++)
        {
            number2 += (int) (l2.get(index)*(Math.pow(10, power2)));
            power2--;
        }
       System.out.println(number2);
       System.out.println(number1 + number2);
    }
    
    public void addTwoLinkedListsByReversingThem(LinkedList<Integer> l1, LinkedList<Integer> l2)
    {
        int number1 = 0;
        int number2 = 0;
        int power1 = l1.size() - 1;
        int power2 = l1.size() - 1;
        for(int index = l1.size() - 1; index >= 0; index--)
        {
            number1 += (int) (l1.get(index)*(Math.pow(10, power1)));
            power1--;
        }
        
        for(int index = l2.size() - 1; index >=0 ; index--)
        {
            number2 += (int) (l2.get(index)*(Math.pow(10, power2)));
            power2--;
        }
        System.out.println(number1);
        System.out.println(number2);
       System.out.println(number1 + number2);
    }
}
