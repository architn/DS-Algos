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
public class RunLengthString {
    
    static String encryptedString(String input){
        StringBuilder builder = new StringBuilder("");
        char[] stringCharacters = input.toCharArray();
        char previousCharacter = stringCharacters[0];
        int wordCount = 1;
        for(int index = 0; index < stringCharacters.length; index++){
            if(previousCharacter == stringCharacters[index]){
                wordCount++;
            }
            else{
                builder.append(wordCount).append(previousCharacter);
                wordCount = 1;
                previousCharacter = stringCharacters[index];
            }
            
            if(index == stringCharacters.length - 1){
                builder.append(wordCount).append(previousCharacter);
            }
        }
        return builder.toString();
    }
    public static void main(String[] args) {
        String test = "aaaaabbbbbcccccccccccdd";
        System.out.println("Run length is: "+encryptedString(test));
    }
    
}
