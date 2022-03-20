/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoderByteProblems;

import java.util.HashMap;
import java.util.Stack;

/**
 *
 * @author architnigam
 * Have the function ThirdGreatest(strArr) take the array of strings stored in strArr and return the third largest word
 * within in. So for example: if strArr is ["hello", "world", "before", "all"] your output should be world
 * because "before" is 6 letters long, and "hello" and "world" are both 5, but the output should be world because
 * it appeared as the last 5 letter word in the array. If strArr was ["hello", "world", "after", "all"] the output
 * should be after because the first three words are all 5 letters long, so return the last one.
 * The array will have at least three strings and each string will only contain letters.
 */
public class ThirdLargest {
    
    static String thirdLargest(String[] array){
        int maxStringLength = Integer.MIN_VALUE;
        int secondLargestStringLength = Integer.MIN_VALUE;
        int thirdLargestStringLength = Integer.MIN_VALUE;
        //String thirdLargestWord = "";
        String secondHighestRankingWord = "";
        String thirdHighestRankingWord = "";
         
        HashMap<Integer, String> ranking = new HashMap<>(); 
        for(String word : array){
            int wordCount = word.length();
            
            if(wordCount >  maxStringLength){
                secondHighestRankingWord = ranking.get(1);
                thirdHighestRankingWord = ranking.get(2);
                ranking.put(1, word);
                System.out.println("Highest "+word);
            }
            else if(wordCount < maxStringLength && wordCount > secondLargestStringLength){
                thirdHighestRankingWord = ranking.get(2);
                ranking.put(2, word);
                System.out.println("Second Highest "+word);
            }
            else if(wordCount < maxStringLength && wordCount < secondLargestStringLength && wordCount >= thirdLargestStringLength ){
                ranking.put(3, word);
                thirdHighestRankingWord = word;
                System.out.println("Third Highest "+word);
            }
        }
        return thirdHighestRankingWord;
    }
    
    public static void main(String[] args) {
        String[] test = {"archit", "vanshika", "amiya", "isha"};
        System.out.println(""+thirdLargest(test));
    }
}
