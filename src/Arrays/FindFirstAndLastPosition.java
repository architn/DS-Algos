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
public class FindFirstAndLastPosition {
    
    // Brute force
    static int[] findFirstANdLastPositionOfTargetLS(int[] arr, int target){
        int[] result = {1, -1};
        int frequencyOfTarget = 0;
        for(int index = 0; index < arr.length; index++){
            if(arr[index] == target){
                if(frequencyOfTarget == 0){
                    result[0] = index;
                    result[1] = index;
                    frequencyOfTarget++;
                }
                else if(frequencyOfTarget > 0){
                    result[1] = index;
                    frequencyOfTarget++;
                }
            }
        }
        return result;
    }
    
    static int[] findFirstANdLastPositionOfTargetBS(int[] arr, int target, int start, int end){
        int[] nothingFound = {1, -1};
        int[] result = new int[2];
        int frequencyOfTarget = 0;
        int middle = (start+end)/2;
        if(end < start){
            return nothingFound;
        }
        else if(target < arr[middle]){
            return findFirstANdLastPositionOfTargetBS(arr, target, start, middle - 1);
        }
        else if(target > arr[middle]){
            return findFirstANdLastPositionOfTargetBS(arr, target, middle + 1, end);
        }
        else if(target == arr[middle]){
            result[0] = middle;
            result[1] = middle;
            if(frequencyOfTarget == 0){
                result[0] = middle;
                result[1] = middle;
                frequencyOfTarget++;
            }
            else if(frequencyOfTarget > 0){
                 result[1] = middle;
                 frequencyOfTarget++;
            }
            return findFirstANdLastPositionOfTargetBS(arr, target, middle + 1, end);
        }
        
        if(frequencyOfTarget > 0);
        
        
        return nothingFound;
    }
    
    public static void main(String[] args) {
        int[] dataSet = {1, 2, 8, 9, 8, 16, 9, 9, 16};
        int[] resultsLS = findFirstANdLastPositionOfTargetLS(dataSet, 9);
        int[] resultsBS = findFirstANdLastPositionOfTargetBS(dataSet, 9, 0, dataSet.length - 1);
        System.out.println("LS: ["+resultsLS[0]+", "+resultsLS[1]+"]");
        System.out.println("BS: ["+resultsLS[0]+", "+resultsLS[1]+"]");
    }
} 
