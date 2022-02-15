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
public class MissingNumberInArray {
    
    
    /* Important Mathematical operation to know: 
        Missing Number = Sum of First N digits - Sum of given array    
    */
    static void findMissingNumberInArray(int arr[]){
        
      int n = arr.length +1;
      int sumOfFirstN = n*(n+1)/2;
      int sumOfArray = 0;
      
      for(int index = 0; index < arr.length; index++){
          sumOfArray += arr[index];
      }
      
      int missingNumber = sumOfFirstN - sumOfArray;
      
      if(missingNumber != 0){
          System.out.println("Missing number is: "+missingNumber);
      }
      else{
            System.out.println("No number is missing");

      }
    }
    
    public static void main(String[] args){
        int[] dataSet = {1, 2, 5, 4};
        findMissingNumberInArray(dataSet);
    }
}
