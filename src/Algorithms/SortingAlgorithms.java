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
public class SortingAlgorithms {
    
    public int[] BubbleSort(int dataSet[])
    {
        
        for(int index = 0; index < dataSet.length ; index++)
        {
            for(int j = 0; j < index; j++)
            {
                if(dataSet[index] < dataSet[j])
                {
                    int temp = dataSet[index];
                    dataSet[index] = dataSet[j];
                    dataSet[j] = temp;
                }
            }
        }
        for(int arr : dataSet)
        {
            System.out.println(arr);
        }
        return dataSet;
    }
    
    public int[] InsertionSort(int dataSet[])
    {
        // We start from 1
        for(int index = 1; index < dataSet.length; index++)
        {
            int currentValue = dataSet[index];
            int j = index - 1;
            while(j >= 0 && dataSet[j] > currentValue)
            {
                dataSet[j+1] = dataSet[j];
                j--;
            }
            dataSet[j+1] = currentValue;
        }
        for(int arr : dataSet)
        {
            System.out.println(arr);
        }
        return dataSet;
    }
    public void MergeSort(int dataSet[])
    {
        int length = dataSet.length;
        if(length<=1)
        {
            return ;
        }
        int middle = length/2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];
        
        int leftIndex = 0;
        int rightIndex = 0;
        
        for(; leftIndex< length; leftIndex++)
        {
            if(leftIndex<middle)
            {
                leftArray[leftIndex] = dataSet[leftIndex];
            }
            else{
                rightArray[rightIndex] = dataSet[leftIndex];
                rightIndex++;
            }
        }
        MergeSort(leftArray);
        MergeSort(rightArray);
        merge(leftArray, rightArray, dataSet);
        
    }
    
    private static void merge(int leftArray[], int rightArray[], int array[])
    {
        int leftSize = (array.length)/2;
        int rightSize = array.length - leftSize;
        
        int i = 0, l = 0, r = 0;
        while(l < leftSize && r < rightSize)
        {
            if(leftArray[l] < rightArray[r])
            {
                array[i] = leftArray[l];
                i++;
                l++;
            }
            else{
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        
        while(l < leftSize)
        {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        
        while(r < rightSize)
        {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
