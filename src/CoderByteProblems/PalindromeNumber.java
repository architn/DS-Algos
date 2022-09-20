/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoderByteProblems;

import java.util.Stack;

/**
 *
 * @author architnigam
 */
public class PalindromeNumber {
    
    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i < s.length();i++)
        {
            stack.push(s.charAt(i));
        }
        String modifiedString = "";
        System.out.println("Length of stack "+stack.size());
        
        while (!stack.isEmpty())
        {
            modifiedString += stack.pop();
        }
        System.out.println(s);
        System.out.println(modifiedString);

        if(modifiedString.equals(s)){
            return true;
        }
        
        return false;
    }
    
    
    
    
    public static void main(String[] args){
        boolean isNumberAPalindrome = isPalindrome(121);
        if(isNumberAPalindrome){
            System.out.println("Yes, the number is a palindrome");
        }
        else{
            System.out.println("No, the number is not a palindrome");

        }
    }
    
}
