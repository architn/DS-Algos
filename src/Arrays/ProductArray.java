/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author architnigam
 * Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 */
public class ProductArray {
    
    static List<Integer> productOfNumbersInArray(int[] arr){
        int mult = multiplication(arr);
        List<Integer> mulArray = new ArrayList<>();
        for(int index = 0; index < arr.length; index++){
            mulArray.add(mult/arr[index]);
        }
        return mulArray;
    }
    
    static int multiplication(int[] arr){
        int mult = 1;
        for(int index = 0; index < arr.length; index++){
            mult*=arr[index];
        }
        return mult;
    }
    
    
     public int lengthOfLastWord(String s) {
        int pointer = s.length() - 1;
        int length = 0;
        while(s.charAt(pointer) == ' '){
            length++;
            pointer--;
        }
        
        return length;
    }
    
    public static void main(String[] args) {
        int[] dataSet = {1, 2, 3, 4, 5};
        List<Integer> result = productOfNumbersInArray(dataSet);
        for(int x : result){
            System.out.println(" "+x);
        }
    }
}
