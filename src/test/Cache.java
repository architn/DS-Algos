/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author architnigam
 *  Cache should be added, extracted, removed
 */
public class Cache {
    private int cacheID;
    private int numberOfTimesCacheWasVisited;
    int visits = 0;
    static Queue<Cache> queueOfCache = new PriorityQueue<>();
    

    public int getCacheID() {
        return cacheID;
    }

    public void setCacheID(int cacheID) {
        this.cacheID = cacheID;
    }

    public int getNumberOfTimesCacheWasVisited() {
        return numberOfTimesCacheWasVisited;
    }

    public void setNumberOfTimesCacheWasVisited(int numberOfTimesCacheWasVisited) {
        this.numberOfTimesCacheWasVisited = numberOfTimesCacheWasVisited;
    }
    
    
    public Queue<Cache> add(Cache cacheValue){
        queueOfCache.add(cacheValue);
        return queueOfCache;
    }
    
    public void remove(Cache cacheValue){
        queueOfCache.remove(cacheValue);
    }
    
    public Cache getCache(){
       Cache cache = queueOfCache.peek();
      
        visits = cache.getNumberOfTimesCacheWasVisited()+ 1;
        cache.setNumberOfTimesCacheWasVisited(visits);
        return cache;
    }
    
    public static Cache findLeastUsedCache(){
        int leastUsed = Integer.MAX_VALUE;
        for(Cache cache : queueOfCache){
         leastUsed = Math.min(leastUsed, cache.getNumberOfTimesCacheWasVisited());
        }
        
        for(Cache cache : queueOfCache){
            if(cache.getNumberOfTimesCacheWasVisited() == leastUsed){
                return cache;
            }
        }
        return null;
    }
    
    public static void main(String[] args){
        Cache leastVisitedCache = findLeastUsedCache();
        System.out.println("Lease Visited Cache was: "+leastVisitedCache.getCacheID());
    }
}
