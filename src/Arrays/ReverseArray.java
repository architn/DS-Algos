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
public class ReverseArray {
   
    static int[] reverseTheArray(int[] arr){
        int[] reversedArray = new int[arr.length];
        int n = arr.length - 1;
        int j = 0;

        for(int index = n; index >= 0; index--){
            reversedArray[j] = arr[index];
            j++;
        }
        return reversedArray;
    }
    
    static int[] reverseArrayPt2(int[] arr){
            int temp = 0;
            for(int index = 0; index < arr.length/2; index++){
                temp = arr[index];
                arr[index] = arr[arr.length - index - 1];
                arr[arr.length - index - 1] = temp;
                System.out.println("Swap");
            }
        return arr;
    }
    
    
    public static void main(String[] args) {
        int[] dataSet = {7, 1, 6, 8, 1};
        int[] dataSet2 = {1, 2, 3, 4, 5, 6};
        for(int x : reverseTheArray(dataSet)){
            System.out.print(x+" ");
        }
        System.out.println("");
        int[] result = reverseArrayPt2(dataSet2);
        for(int x : result){
            System.out.print(x+" ");
        }
        
    }
}
