/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.HashMap;

/**
 *
 * @author architnigam
 */
public class DuplicateCharacter {
    
    static void findDuplicateCharactersInString(String givenString){
        HashMap<Character, Integer> frequencyOfChars = new HashMap<>();
        
        for(int index = 0; index < givenString.length(); index++){
            char c = givenString.charAt(index);
            if(!frequencyOfChars.containsKey(c)){
                frequencyOfChars.put(givenString.charAt(index), 1);
            }
            else{
                frequencyOfChars.put(c, frequencyOfChars.get(c) + 1);
            }
        }
        for(Character c : frequencyOfChars.keySet()){
            int frequency = frequencyOfChars.get(c);
            if(frequency > 1){
                System.out.println("Frequency of "+c+" is: "+frequency);
            }
        }
    }
    
    public static void main(String[] args){
        findDuplicateCharactersInString("mississippi");
    }
    
}
