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
public class SeperateTargetValueFromArray {
    
    
    static void seperateTargetValue(int arr[], int target){
        for(int index = 0; index < arr.length; index++){
            
            int j = arr.length - 1;
            while(index < j && j>= 0 && arr[j] != target){
                j--;
            }
            
            if(arr[j] == target){
                int temp = 0;
                temp = arr[index];
                arr[index] = arr[j];
                arr[j] = temp;            
            }
            
        }
        for(int x : arr){
            System.out.print(" "+x);
        } 
        
    }
    
    public static void main(String[] args){
        int[] dataSet = {1, 9, 4, 9, 1, 9, 9, 9,  2, 3};
        seperateTargetValue(dataSet, 9);
    }
}
