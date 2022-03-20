/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoderByteProblems;

/**
 *
 * @author architnigam
 */
public class PalindromeString {
    
    static boolean isStringAPalindrome(String str){
        String specialCharactersRemoved = removeSpecialCharactersFromAString(str).toString();
        String reversedString = "";
        int lengthOfString = specialCharactersRemoved.length();
        for(int index = lengthOfString - 1; index >= 0; index--){
            reversedString +=  specialCharactersRemoved.charAt(index);
        }
        if(reversedString.equalsIgnoreCase(specialCharactersRemoved)){
            return true;
        }
        return false;
    }
    
    static StringBuilder removeSpecialCharactersFromAString(String str){
        StringBuilder specialCharactersRemovedString = new StringBuilder("");
        char[] characters = str.toCharArray();
        for(char c:  characters){
            if(Character.isLetter(c)){
                specialCharactersRemovedString.append(c);
            }
        }
        
        return specialCharactersRemovedString;
    }
    
    public static void main(String[] args) {
        String str = "Anne, I vote more cars race Rome-to-Vienna";
        System.out.println(isStringAPalindrome(str));
    }
}
