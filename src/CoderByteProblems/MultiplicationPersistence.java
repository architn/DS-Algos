/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoderByteProblems;

/**
 *
 * @author architnigam
 * * Have the function MultiplicativePersistence(num) take the num parameter being passed which will always be a
 * positive integer and return its multiplicative persistence which is the number of times you must multiply the digits
 * in num until you reach a single digit. For example: if num is 39 then your program should
 * return 3 because 3 * 9 = 27 then 2 * 7 = 14 and finally 1 * 4 = 4 and you stop at 4.
 */
public class MultiplicationPersistence {
    
    static int multiplicationPersistence(int num, int count){
        String numberOfchars = String.valueOf(num);
        int newNum = 1;

        if(numberOfchars.length() == 1){
            return count;
        }
        else{
            for (char c : numberOfchars.toCharArray()) {
            newNum *= Integer.valueOf(String.valueOf(c));
            }
            return multiplicationPersistence(newNum, ++count);
        }
    }
    
    public static void main(String[] args) {
        System.out.println(""+multiplicationPersistence(45, 0));
    }
    
}
