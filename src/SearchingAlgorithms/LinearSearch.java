/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SearchingAlgorithms;

/**
 *
 * @author architnigam
 */
public class LinearSearch {
    
    static int doLinearSearch(int arr[], int target){
        
        
        for(int index = 0; index < arr.length; index++){
            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }
    
    
    public static void main(String[] args){
        int[] dataSet = {1, 5, 6, 9, 12, 14, 18};
        int index = doLinearSearch(dataSet, 14);
        
        if(index == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index '"+index+"' using Linear Search");
        }
    }
    
    
}
