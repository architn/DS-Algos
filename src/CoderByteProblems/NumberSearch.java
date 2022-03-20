/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoderByteProblems;

/**
 *
 * @author architnigam
 * Have the function NumberSearch(str) take the str parameter, search for all the numbers in the string,
 * add them together, then return that final number divided by the total amount of letters in the string.
 * For example: if str is "Hello6 9World 2, Nic8e D7ay!" the output should be 2. First if you add up all the numbers,
 * 6 + 9 + 2 + 8 + 7 you get 32. Then there are 17 letters in the string. 32 / 17 = 1.882, and the final answer should
 * be rounded to the nearest whole number, so the answer is 2. Only single digit numbers separated by spaces will be
 * used throughout the whole string (So this won't ever be the case: hello44444 world).
 * Each string will also have at least one letter.
 */
public class NumberSearch {
    final static String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    final static String LOWER = UPPER.toLowerCase();
    final static String NUMBERS = "0123456789";
    static float numberSearch(String str){
        float sumOfDigits = 0;
        float charCount = 0;
        char[] characters = str.toCharArray();
        for(char c : characters){
            if(NUMBERS.indexOf(c) != -1){
                sumOfDigits += Float.valueOf(String.valueOf(c));
            }
            else if(UPPER.indexOf(c) != -1 || LOWER.indexOf(c) != -1){
                charCount++;
            }
            
        }
        return sumOfDigits/charCount;
    }
    
    public static void main(String[] args) {
        String str = "Hello6 9World 2, Nic8e D7ay!";
        System.out.println(numberSearch(str));
    }
}
