/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SearchingAlgorithms;

/**
 *
 * @author architnigam
 */

/*
    Drawbacks: Array needs to be sorted.
*/
public class BinarySearch {
    
    static int doBinarySearchRecursive(int arr[], int target, int start, int end){
       
        int mid = (start + end)/2;
        
        if(end < start){
            return -1;
        }
        
        if(arr[mid] < target){
            return doBinarySearchRecursive(arr, target, mid+1, end);
        }
        
        if(arr[mid] > target){
            return doBinarySearchRecursive(arr, target, start, mid - 1);
        }
        
        if(arr[mid] == target){
            return mid;
        }
    return 0;
    
    }
    
    public static void main(String[] args){
        int[] dataset = {1, 3, 5, 7, 8};
        int index = doBinarySearchRecursive(dataset, 3, 0, dataset.length - 1);
        
        if(index == -1){
            System.out.println("Element not found");
        }
        else if(index > 0){
            System.out.println("Element found at index: "+index);
        }
        else if(index == 0){
            System.out.println("Some error");
        }
    }
}
