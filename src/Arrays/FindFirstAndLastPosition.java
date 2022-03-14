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
    
    static int[] findFirstANdLastPositionOfTargetBS(int[] arr, int target){
        int[] nothingFound = {1, -1};
        int[] result = new int[2];
        
        
        
        return nothingFound;
    }
    
    public static void main(String[] args) {
        int[] dataSet = {1, 2, 8, 9, 8, 16, 9, 9, 16};
        int[] resultsLS = findFirstANdLastPositionOfTargetLS(dataSet, 9);
        System.out.println("["+resultsLS[0]+", "+resultsLS[1]+"]");
    }
}
