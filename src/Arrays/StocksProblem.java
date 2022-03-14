/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.HashMap;

/**
 *
 * @author architnigam
 * 
 * Given an array of integers representing stock price on single day, find max profit that can be earned by 1 transaction.
So you need to find pair (buyDay,sellDay) where buyDay < = sellDay and it should maximise the profit.
* For example: 
* 
* int arr[]={14, 12, 70, 15, 99, 65, 21, 90};
    Max profit can be gain by buying at 1th day(0 based indexing) and sell at 4th day.
    Max profit = 99-12 =87
 */
public class StocksProblem {
    
    
    static HashMap<Integer, int[]> stocksMaximizeProfit(int[] arr){
        int maxProfit = Integer.MIN_VALUE;
        int startDay = 0;
        int endDay = 0;
        int[] days = new int[2];
        HashMap<Integer, int[]> maxProfitValues = new HashMap<>();
        for(int index = 0; index < arr.length; index++)
        {
            int j = arr.length - 1;
            while(j > index && j>=0 && arr[index] > arr[j]){
                j--;
            }
            int profit = arr[j] - arr[index];
           if(profit > maxProfit){
               maxProfit = profit;
               startDay = index;
               endDay = j;
               j++;
           }
        }
        days[0] = startDay;
        days[1] = endDay;
        maxProfitValues.put(maxProfit, days);
        return maxProfitValues;
    }
    
    
    public static void main(String[] args){
        int dataset[]={14, 12, 2, 15, 99, 65, 21, 99};
        HashMap<Integer, int[]> results = stocksMaximizeProfit(dataset);
        int[] bestSellingDays = new int[2];
        int mxProfit = 0;
        for(int num : results.keySet()){
            mxProfit = num;
        }
        
        for(int[] num : results.values()){
            bestSellingDays = num;
        }
        
        System.out.println("Maximimum profit is: "+mxProfit+"\n Best Day to buy: "+bestSellingDays[0]+"\n Best Day to sell: "+bestSellingDays[1]);
    }
    
}
