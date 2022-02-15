/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author architnigam
 */
public class Anagrams {
    
    
    static boolean areTwoStringsAnagramsOfEachOther(String originalString, String anagram){
        
        if(originalString.length() != anagram.length())
            return false;
        
        // Logic: If at any point, the charcater in original string is not present in anagram, return false
        for(int index = 0; index < originalString.length(); index++){
            char c = originalString.charAt(index);
            int indexOfCharacterInAnagramString = anagram.indexOf(c);
            
            if(indexOfCharacterInAnagramString == -1){
                return false;
            }
            
        }
        return true;
    }
    
    public static void main(String[] args){
        System.out.println("Test Case 1: java2blog and aj2vabgol are anagrams of each other: "
                + ""+areTwoStringsAnagramsOfEachOther("java2blog", "aj2vabgol"));
         System.out.println("Test Case 2: java2blog and aj2vabgol are anagrams of each other: "
                + ""+areTwoStringsAnagramsOfEachOther("java2blog", "aj3vabgol"));
        System.out.println("Test Case 3: java2blog and archit are anagrams of each other: "
                + ""+areTwoStringsAnagramsOfEachOther("java2blog", "archit"));
    }
}
