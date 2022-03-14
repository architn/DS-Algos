/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author architnigam
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. 
 * If not, return the index where it would be if it were inserted in order.
 */
public class SearchInsertPosition {
    
    
    // Linear Search : Time complexity of O(n)
    
    static int returnIndexOfPositionOfInsertionLS(int[] arr, int target){
        int lastIndex = arr.length - 1;
        if(target <= arr[0])
        {
            return 0;
        }
        else if(target >= arr[lastIndex])
        {
            return arr.length;
        }
        else{
            for(int index = 1; index <= lastIndex - 1; index++){
                if(arr[index] == target){
                    return index;
                }
                else if(arr[index - 1] < target && target < arr[index + 1]){
                    return index + 1;
                }
            }
        }
        return -1;
        
    }
    
//    static void returnIndexOfPositionOfInsertionBS(int arr[], int target){
//        int middle = arr.length/2; 
//        
//        if(arr)
//    }
    
    
    
    public static void main(String[] args) {
        int[] dataSet = {1, 3, 5, 6};
        int[] dataSet1 = {1, 10, 100, 1000};
        System.out.println(returnIndexOfPositionOfInsertionLS(dataSet, 6));
        System.out.println(returnIndexOfPositionOfInsertionLS(dataSet, 4));
        System.out.println(returnIndexOfPositionOfInsertionLS(dataSet, 2));
        System.out.println(returnIndexOfPositionOfInsertionLS(dataSet, 7));
        System.out.println(returnIndexOfPositionOfInsertionLS(dataSet1, 50));
    }
}
