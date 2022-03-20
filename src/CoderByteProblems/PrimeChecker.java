/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoderByteProblems;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author architnigam
 * Have the function PrimeChecker(num) take num and return 1 if any arrangement of num comes out to be a prime number,
 * otherwise return 0. For example: if num is 910, the output should be 1 because 910 can be
 * arranged into 109 or 019, both of which are primes.
 */
public class PrimeChecker {
    
    static boolean PrimeCheckerFunction(int num){
        for(int index = 2; index <= num/2; index++){
            if(num%index == 0){
                return false;
            }
        }
        return true;
    }
    
    
    public static void main(String[] args) {
        System.out.println("Is it prime? "+PrimeCheckerFunction(12));
         System.out.println("Is it prime? "+PrimeCheckerFunction(11));
    }
}


