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
public class RotateAnArray {
    
    
    static int[] rotateAnArrayByK(int arr[], int k){
        
        int temp = 0;
        //int counter = 0;w
        while(k < arr.length){
            for(int index = 0; index <= arr.length/2; index++){
            temp = arr[index];
            arr[index] = arr[k-1];
            arr[k-1] = temp;
            k++;
        }
    }
        
    return arr;
    }
    
    public static void main(String[] args){
        int[] dataset = {5, 6, 1, 2, 3, 4};
        // If K = 2
        // Expected Dataset = {1, 2, 3, 4, 5, 6}
        int[] result = rotateAnArrayByK(dataset, 4);
        for(int x : result){
            System.out.print(x+" ");
        }
    }
}
