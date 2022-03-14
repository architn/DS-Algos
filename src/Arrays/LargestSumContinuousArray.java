/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author architnigam
 * Question 37 : Largest sum contiguous subarray.

 */
public class LargestSumContinuousArray {
    
    static int largestContinuousArray(int[] arr){
       
        
        /* We will be using Kandane's algorithm
        
         - Initialize two variables, maxSoFar, maxEndingHere
         - maxEndingHere = maxEndingHere + a[i]
         - Check if maxEndingHere < 0, if yes make it 0
         - Check if maxEndingHere > maxSumNow, if yes, maxSumNow = maxEndingHere
         */
        int maxSoFar = 0;
        int maxEndingHere = 0;
        for(int index = 0; index < arr.length; index++){
            maxEndingHere += arr[index];
            if(maxEndingHere < 0){
                maxEndingHere = 0;
            }
            
            if(maxEndingHere > maxSoFar){
                maxSoFar = maxEndingHere;
            }
        }
        return maxSoFar;
    }
    
    public static void main(String[] args){
        int[] dataSet = {20, 2, 0, -6, -40, 1, 3};
        System.out.println("Maximum Sum of Array: "+largestContinuousArray(dataSet));
    }
    
}
