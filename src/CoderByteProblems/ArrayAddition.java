/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoderByteProblems;

import java.util.Arrays;

/**
 *
 * @author architnigam
 * Have the function ArrayAdditionI(arr) take the array of numbers stored in arr and return the string true if any
 * combination of numbers in the array can be added up to equal the largest number in the array, otherwise return the
 * string false. For example: if arr contains [4, 6, 23, 10, 1, 3] the output should return true because
 * 4 + 6 + 10 + 3 = 23. The array will not be empty, will not contain all the same elements,
 * and may contain negative numbers.
 */
public class ArrayAddition {
    
    static boolean arrayAdditionSum(int[] arr){
        Arrays.sort(arr);
        int length = arr.length;
        int highestNumber = arr[length - 1];
        
        for(int index = 0; index < arr.length - 1; index++){
            int sum = 0;
            int j = index + 1;
            sum = arr[index];
            while(j < arr.length - 1){
                sum += arr[j];
                if(sum == highestNumber){
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] dataSet = {4, 6, 23, 10, 1, 3};
        System.out.println(arrayAdditionSum(dataSet));
    }
}
