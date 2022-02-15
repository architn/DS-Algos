/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortingAlgorithm;

/**
 *
 * @author architnigam
 */
public class BubbleSort {
    
    static void sortViaBubbleSortAscendingOrder(int arr[]){
        for(int index = 0; index < arr.length; index++){
            int j = index + 1;
            int temp = 0;
            while(j < arr.length){
                if(arr[index] > arr[j]){
                    temp = arr[index];
                    arr[index] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        System.out.println("Ascending Order");
        for(int x : arr){
            System.out.print(" "+x);
        }
    }
    
    static void sortViaBubbleSortDescendingOrder(int arr[]){
        for(int index = 0; index < arr.length; index++){
            int j = index + 1;
            int temp = 0;
            while(j < arr.length){
                if(arr[j] > arr[index]){
                    temp = arr[j];
                    arr[j] = arr[index];
                    arr[index] = temp;
                }
                j++;
            }
        }
        System.out.println("\nDescending Order");
        for(int x : arr){
            System.out.print(" "+x);
        }
    }
    public static void main(String[] args){
        int[] dataset = {1, 9, 8, 7, 6};
        sortViaBubbleSortAscendingOrder(dataset);
        sortViaBubbleSortDescendingOrder(dataset);
    }
}
