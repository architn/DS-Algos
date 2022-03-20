/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoderByteProblems;

/**
 *
 * @author architnigam
 */
public class FibonacciNumber {
    // Fibonacci Number has 1, 2, 3, 5, 8, 13, 21, 34, 55.......
    
    static boolean fibonacciNumberDetermine(int num){
        int fib1 = 0; 
        int fib2 = 1;
        while (fib2 < num){
            int temp = fib1;
            fib1 = fib2;
            fib2= temp + fib1;
        }
        
        if(fib2==num){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        System.out.println(fibonacciNumberDetermine(55));
    }
}
