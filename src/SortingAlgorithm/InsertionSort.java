/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortingAlgorithm;

/**
 *
 * @author architnigam
 * 
 * 
 *          Time Complexity of this Algorithm
 * 
 */

public class InsertionSort {
    
    
    static void sortViaInsertionSort(int arr[]){
        for(int i = 1; i < arr.length; i++){
            int valueToSort = arr[i];
            int j;
            
            // If value at j-1 index is greater than value at j, add j-1 value at j position.
            
            for(j = i; j>0 && arr[j - 1] > valueToSort; j--){
                arr[j] = arr[j-1]; 
            }
            
            // Point where we insert the selected element
            arr[j] = valueToSort;
        }
        
        for(int x : arr){
            System.out.print(" "+x);
        }
    }
    
    public static void main(String[] args){
        int[] dataset = {1, 50, 2, 0, 22, 8};
        sortViaInsertionSort(dataset);
    }
}
