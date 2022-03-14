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
public class JumpGame {
    
    
    static boolean didUserReachLastPosition(int[] nums, int index){
         if(index == (nums.length - 1) ){
             return true;
         }
        int lastIndex = nums.length - 1;
        boolean wasConditionMet = false;
        int startingPosition = nums[index];
        index +=  startingPosition;
        //System.out.println("Loop Post Modification: "+index);
        if(didUserReachLastPosition(nums, index)){
            wasConditionMet = true;
            return wasConditionMet;
        }
        else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        int[] dataSet = {4, 3, 1, 1, 5};
        int[] dataSet2 = {2, 3, 1, 1, 4};
        int[] dataSet3 = {3,2,1,0,4};
        System.out.println(didUserReachLastPosition(dataSet, 0));
        System.out.println(didUserReachLastPosition(dataSet2, 0));
        //System.out.println(didUserReachLastPosition(dataSet3, 0));
    }
}
