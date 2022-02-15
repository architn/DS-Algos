/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.Stack;

/**
 *
 * @author architnigam
 */
public class ReverseAString {
    
     static String reverseStringUsingStack(String testString)
    {
        Stack<Character> stack = new Stack<>();
        for(int index = 0; index < testString.length(); index++)
        {
            stack.push(testString.charAt(index));
        }
        String reversedString = "";
        
        while(!stack.isEmpty()){
            reversedString += stack.pop();
        }
        
        return reversedString;
    }
     
     public static void main(String[] args){
         System.out.println(reverseStringUsingStack("archit"));
     }
    
}
