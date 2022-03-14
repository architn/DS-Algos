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
public class LongestSubstring {
    final static String ALPHABETS = "abcdefghijklmnopqrstuvwxyz";
    final static String ALPHABETS_UPPERCASE = ALPHABETS.toUpperCase();
    
    static String longestStringPossible(String sentence){
        String[] words = sentence.split("\\s");
        String longestWord = null;
        int longestWordLength = 0;
        
        for(String word : words){
            int wordLength = getWordLength(word);
            if (longestWord == null || wordLength > longestWordLength) {
                longestWord = word.substring(0, wordLength);
                longestWordLength = wordLength;
            }
        }
        return longestWord;
    }
    
    static int getWordLength(String str){
        int length = 0;
        for(char c : str.toCharArray()){
            if(ALPHABETS.indexOf(c) > -1 || ALPHABETS_UPPERCASE.indexOf(c) > -1){
                length++;
            }
        }
        return length;
    }
    
    public static void main(String[] args) {
        System.out.println("Longest substring is: "+longestStringPossible("fun123 ti"));
    }
}
