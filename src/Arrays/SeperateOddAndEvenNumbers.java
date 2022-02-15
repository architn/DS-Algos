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
public class SeperateOddAndEvenNumbers {
    
    
    static int[] seperateOddAndEven(int arr[]){
        for(int index = 0; index < arr.length; index++){
            int left = 0; 
            int right = arr.length - 1;
            
            while(arr[left] % 2 == 0){
                left++;
            }
            
            while(arr[right] % 2 != 0){
                right--;
            }
            int temp = 0;
            if(left < right){
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        return arr;
    }
    
    public static void main(String[] args){
        int[] dataSet = {1, 26, 5, 22, 7, 9, 20, 10};
        int[] sortedArray =  seperateOddAndEven(dataSet);
        for(int x : sortedArray){
            System.out.print(" "+x);
        }
    }
}
