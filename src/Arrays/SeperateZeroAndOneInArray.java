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
public class SeperateZeroAndOneInArray {
    
    
    static int[] seperateZerosAndOne(int arr[]){
        for(int index = 0; index < arr.length; index++){
            int left = 0;
            int right = arr.length - 1;
            
            // We iterate till we find an element with value of 1
            while(arr[left] == 0){
                left++;
            }
            // We iterate till we find an element with value of 0
            while(arr[right] == 1){
                right--;
            }
            int temp = 0;
            
            // if positional index of 0 is less than positional index of 1, we swap the 
            if(left < right){
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        return arr;
    }
    
    public static void main(String[] args){
        int[] dataSet = {0, 1, 0, 0, 1, 1, 0};
        int[] sortedArray = seperateZerosAndOne(dataSet);
        for(int x : sortedArray){
            System.out.println(" "+x);
        }
    }
}
