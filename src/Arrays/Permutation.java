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
 * Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order
 */
public class Permutation {
    
    
    static List<List<Integer>> createPermutations(int[] arr){
        
        List<List<Integer>> permutations = new ArrayList<>();
        List<Integer> innerPremutations = new ArrayList<>();
        for(int index = 0; index < arr.length; index++){
            innerPremutations.add(arr[index]);
            int j = index + 1;
            while(j < arr.length){
                innerPremutations.add(arr[j]);
                j++;
            }
           permutations.add(innerPremutations);
        }
        return permutations;
    }
    
    public static void main(String[] args) {
        int[] dataSet = {1, 2, 3};
        List<List<Integer>> output = createPermutations(dataSet);
        for(List<Integer> set : output){
            for(int num : set){
                System.out.print(" "+num);
            }
        }
    }
}
