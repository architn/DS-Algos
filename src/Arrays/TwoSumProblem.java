/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.HashMap;

/**
 *
 * @author architnigam
 */
public class TwoSumProblem {
    
    
    static void solveTwoSumWithTargetOnlyOneValue(int arr[], int target){
        
        
        // X + Y = Target
        // Y = Target - X, where X = arr[i], and then we scan the array for Y.
        
        int difference = 0;
        int index1 = 0;
        int index2 = 0;
        int num1 = 0; 
        int num2 = 0;
        for(int index = 0; index < arr.length; index++){
            int j = arr.length - 1;
            difference = target - arr[index];
            while(j > 0){
                if(difference != arr[j] ){
                j--;
            }
            else{
                index1 = index;
                num1 = arr[index1];
                index2 = j;
                num2 = arr[index2];
                break;
            }
        }
            
        }
        System.out.println(+num1+ " at position: ("+index1+") + "+num2+" at position ("+index2+""
                + ") is equal to target: "+target);
    }
    
    /*
            Q:  Find subarrays with given sum in an array.
    */
    
    static void solveTwoSumWithTargetMultipleValues(int arr[], int target){
        int difference = 0;
        HashMap<Integer, Integer> startEndIndices = new HashMap<>();
        for(int index = 0; index < arr.length; index++){
            difference = target - arr[index];
            int j = arr.length - 1;
            while(j>0){
                if(difference == arr[j]){
                    startEndIndices.put(index, j);
                }
                j--;
            }
        }
        
        for(int startingIndex : startEndIndices.keySet()){
            System.out.println("Starting Index: "+startingIndex+" Ending Index: "
                    +startEndIndices.get(startingIndex));
        }
    }
    
    public static void SolveTwoSumProblemAdjacentWithSlidingWindow(int[] dataSet, int target){
        int i = 0; 
        int j = i+1;
        HashMap<Integer, Integer> startEndIndices = new HashMap<>();
        while(i < dataSet.length && j < dataSet.length){
            if((dataSet[i] + dataSet[j]) == target){
                startEndIndices.put(i, j);
                break;
            }
            else{
                i++;
                j++;
            }
        }
        for(int startingIndex : startEndIndices.keySet()){
            System.out.println("Starting Index: "+startingIndex+" Ending Index: "
                    +startEndIndices.get(startingIndex));
        }
    }
    
    public static void main(String[] args){
        int[] dataset = {1, 2, 5, 7, 9};
        int[] dataset1 = {1, 2, 5, 8, 9, 0};

        //solveTwoSumWithTargetOnlyOneValue(dataset, 6);
        //solveTwoSumWithTargetMultipleValues(dataset1, 9);
        SolveTwoSumProblemAdjacentWithSlidingWindow(dataset, 16);
    }
    
    
}
