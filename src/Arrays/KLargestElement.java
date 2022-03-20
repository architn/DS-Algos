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
public class KLargestElement {
    
    static int kthLargestElementInArray(int[] array, int k){
        if(k > array.length){
            return -1;
        }
        
        for(int index = 0; index < array.length; index++){
            
        }
        return 0;
    }
    
    
    public static void main(String[] args) {
        int[] dataSet = {3,2,1,5,6,4};
        int result = kthLargestElementInArray(dataSet, 4);
    }
}
