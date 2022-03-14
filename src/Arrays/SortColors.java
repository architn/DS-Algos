/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author architnigam
 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.
 */
public class SortColors {
    
    static void sortColor(int[] arr){
        for(int index = 0; index < arr.length; index++){
            int redPointer = arr.length - 1;
            int whitePointer = arr.length - 1;
            int bluePointer = arr.length - 1;
        }
    }
    
    public static void main(String[] args) {
        int[] dataSet = {2, 0, 2, 1, 1, 0};
        int[] dataSet1 = {1, 0, 1, 0, 1, 0};
        sortColor(dataSet);
        System.out.println("");
        sortColor(dataSet1);
    }
}
