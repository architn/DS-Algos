        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

/**
 *
 * @author architnigam
 */
public class SlidingWindowAlgorithm {
    
    
    /** Find max sub array of sum k
     * Example input:
     * [4, 2, 1, 7, 8, 1, 2, 8, 1, 0]
     * @param arr[]
     * @param k
     */
    
    public int MaxSubArray(int arr[], int k)
    {
        int currentRunningSum = 0;
        int maximumSum = Integer.MIN_VALUE;
        
        for(int index = 0; index < arr.length; index++)
        {
            currentRunningSum += arr[index];
            
            if(index >= k-1){
                maximumSum = Math.max(maximumSum, currentRunningSum);
                currentRunningSum -= arr[index - (k-1)];
            }
        }
        return maximumSum;
    }
    
    /**
     * Example:
     * 
     * @param arr
     * @param smallestSum
     * @return 
     */
    public int SmallestSubArrayWithGivenSum(int arr[], int smallestSum)
    {
        int currentRunningSum = 0;
        int windowStart = 0;
        int minWindowSize = Integer.MAX_VALUE;
        for(int windowEnd = 0; windowEnd < arr.length; windowEnd++)
        {
            currentRunningSum += arr[windowStart];
            
            while( currentRunningSum >= smallestSum)
            {
                minWindowSize = Math.min(minWindowSize, windowEnd - windowStart + 1);
                currentRunningSum -= arr[windowStart];
                windowStart++;
            }
        }
        return minWindowSize;
    }
    
    
    /*
        Find maxiumum element in all sub arrays in a 
        https://java2blog.com/sliding-window-maximum-java/
    */
    
}
