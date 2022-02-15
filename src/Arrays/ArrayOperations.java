/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author architnigam
 */
public class ArrayOperations {
    
    public void printArrayInteger(List<Integer> arrayList)
    {
        for(int a : arrayList)
        {
            System.out.print(" "+ a);
        }
    }
    
    public void printArrayString(List<String> array)
    {
        for(String a : array)
        {
            System.out.print(" "+ a);
        }
    }
    
    public void removeDuplicateFromArrayList(ArrayList<String> array)
    {
        LinkedHashSet<String> set= new LinkedHashSet<>();
        
        for(String word : array)
        {
            set.add(word);
        }
        
        for(String word : set)
        {
            System.out.print(" "+ word);
        }
    }
  
    /**
	 * Find largest possible difference between any two elements within an array
	 *
	 * @param arr
	 * @return
	 */
    private static void largestDifferenceBetweenTwoElements(int [] testArray)
    {
        
    }
    
}
