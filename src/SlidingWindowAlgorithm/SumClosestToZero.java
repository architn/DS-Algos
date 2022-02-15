/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SlidingWindowAlgorithm;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author architnigam
 */
public class SumClosestToZero {
    
    
    static List<Integer> findPairWithSumClosestToZero(int arr[]){
        List<Integer> additions = new ArrayList<>();
        int k = 2;
        for(int index = 0; index < arr.length; index++){
            int sum = 0;
            int windowStart = 0;
            while(windowStart < index + k -1){
                sum += arr[index];
                windowStart++;
            }
            additions.add(sum);
        }
        return additions;
    }
    
    public static void main(String[] args){
        int[] dataSet = {1, 2, 3, 4};
        List<Integer> sums = findPairWithSumClosestToZero(dataSet);
        for(int x :sums ){
            System.out.println(x);
        }
    }
}
