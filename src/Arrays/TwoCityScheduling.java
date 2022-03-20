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
public class TwoCityScheduling {
    
    static int minimumCostOfFlying(int cost[][]){
        int minimumSum = 0;
        for(int outerLoop = 0; outerLoop < cost.length; outerLoop++){
            for(int innerLoop = 0; innerLoop < cost[outerLoop].length - 1; innerLoop++){
                int minValue = Math.min(cost[outerLoop][innerLoop], cost[outerLoop][innerLoop+1]);
                minimumSum += minValue;
            }
        }
        return minimumSum;
    }
    
    public static void main(String[] args) {
        int[][] dataSet = {{10,20},{30,200},{400,50},{30,20}};
        int[][] dataSet2 = {{515,563},{451,713},{537,709},{343,819},{855,779},{457,60},{650,359},{631,42}};
        System.out.println(minimumCostOfFlying(dataSet));
        System.out.println(minimumCostOfFlying(dataSet2));
    }
    
}
