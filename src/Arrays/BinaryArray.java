/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author architnigam
 */
public class BinaryArray {
    
    static int LargestContinuousSum(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int maxCurrentSum = 0;
        for(int index = 0; index < arr.length; index++){
            maxCurrentSum += arr[index];
            maxSum = Math.max(maxCurrentSum, maxSum);
        }
        return maxSum;
    }
    
    
    public static void main(String[] args) {
        int[] dataSet = {0, 1, 1, 1, 1, 0, 0, 0, 0, 1};
        System.out.println(""+LargestContinuousSum(dataSet));
    }
}
