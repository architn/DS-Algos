/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author architnigam
 */
public class MergingTwoSortedArrays {
    
    static List<Integer> mergingTwoSortedArrays(int[] arr1, int[] arr2){
        List<Integer> result = new ArrayList<>();
        // Solving with 2 pointers
        int list1Pointer = 0;
        int list2Pointer = 0;
        int max = Integer.MIN_VALUE;
        while(list1Pointer < arr1.length && list2Pointer < arr2.length){
            if(arr1[list1Pointer] < arr2[list2Pointer]){
                max = arr2[list2Pointer];
                result.add(arr1[list1Pointer]);
                list1Pointer++;
            }
            else if(arr1[list1Pointer] > arr2[list2Pointer]){
                max = arr1[list1Pointer];
                result.add(arr2[list2Pointer]);
                list2Pointer++;
            }
            else{
                max = arr1[list1Pointer];
                result.add(arr2[list2Pointer]);
                list1Pointer++;
                list2Pointer++;
            }
        }
        result.add(max);
        return result;
        
    }
    
    public static void main(String[] args) {
        int[] array1 = {1, 50, 100, 400};
        int[] array2 = {10, 80, 120, 500};
        List<Integer> results = mergingTwoSortedArrays(array1, array2);
        for(int num : results){
            System.out.print(" "+num);
        }
    }
}
