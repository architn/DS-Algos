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
public class SecondHighestNumberInArray {
    
    
    /*
        Two conditions must be checked:
    1. When current index number is the highest number
    2. When current index number is greater than second largest number but not greater than the highest number
    eg: {1, 3, 2}
        - Iteration 2: Max = 3, Second Highest = 1
        - Iteration 3: Max = 3, however current number 2 is greater than existing highest i.e. 1 hence we 
          assign second highest number to 2.
    */
    static void calculateSecondHighestNumberInArray(int arr[]){
        int highestNumber = Integer.MIN_VALUE;
        int secondHighestNumber = Integer.MIN_VALUE;
        
        for(int index = 0; index < arr.length; index++){
            if(arr[index] > highestNumber){
                secondHighestNumber = highestNumber;
                highestNumber = arr[index];
            }
            else if (arr[index] > secondHighestNumber && arr[index]!=secondHighestNumber){
                secondHighestNumber = arr[index];
            }
        }
        
        System.out.println("Second highest number in an array is: "+secondHighestNumber);;
    }
    
    public static void main(String[] args){
        int[] dataSet = {1, 11, 5, 4, 3};
        calculateSecondHighestNumberInArray(dataSet);
    }
    
}
