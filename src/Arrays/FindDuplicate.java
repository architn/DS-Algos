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
public class FindDuplicate {
    
    static int findDuplicate(int[] nums){
        for(int index = 0; index < nums.length; index++){
            int j = nums.length - 1;
            while(index < j){
                if(nums[index] == nums[j]){
                    return nums[index];
                }
                else{
                    j--;
                }
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] dataSet = {1,3,4,2,2};
        int result = findDuplicate(dataSet);
        if(result != -1){
            System.out.println("Duplicate Number is: "+result);
        }
        else{
            System.out.println("No duplicates");
        }
    }
}
