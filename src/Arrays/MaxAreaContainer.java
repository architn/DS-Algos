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
public class MaxAreaContainer {
    
    static int maxArea(int[] arr){
        // Height = Minima of the range - MINIMIZE
        // Breadth = Number of values in range - MAXIMIZE
        
        int windowStart = 0;
        int area = 0;
        int maxArea = Integer.MIN_VALUE;
        for(int index = 0; index < arr.length; index++){
            windowStart++;
            maxArea = arr[index] * windowStart;
            while(area > maxArea){
                
            }
        }
        return maxArea;
    }
    
    public static void main(String[] args) {
        
    }
}
