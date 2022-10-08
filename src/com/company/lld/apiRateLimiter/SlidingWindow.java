package com.company.lld.apiRateLimiter;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class SlidingWindow {
    private Queue<Long> slidingWindow;
    private long timeWindowInSeconds;
    private int bucketCapacity;

    public SlidingWindow(long timeWindowInSeconds, int bucketCapacity) {
        this.timeWindowInSeconds = timeWindowInSeconds;
        this.bucketCapacity = bucketCapacity;
        slidingWindow = new ConcurrentLinkedDeque<>();
    }

    public boolean grantAccess(int id){
        long currentTimeStamp = System.currentTimeMillis();
        long remainingTime =checkAndUpdateQueue(currentTimeStamp);
        //System.out.println(currentTimeStamp);
        if(slidingWindow.size()<bucketCapacity){
            slidingWindow.offer(currentTimeStamp);
            return true;
        }
        try{
            Thread.sleep(remainingTime);
        }catch (Exception e){

        }
        System.out.println(Thread.currentThread().getName()+" for "+id+" goes for next interval after "+remainingTime);
        return grantAccess(id);
        //return false;
    }

    private long checkAndUpdateQueue(long currentTimeStamp) {
        if(slidingWindow.isEmpty())return 0;
        long calculatedTime = (currentTimeStamp - slidingWindow.peek());
        while(calculatedTime >= timeWindowInSeconds){
            slidingWindow.poll();
            if(slidingWindow.isEmpty())break;
            calculatedTime = (currentTimeStamp - slidingWindow.peek());
        }
        return timeWindowInSeconds-calculatedTime;
    }
}
