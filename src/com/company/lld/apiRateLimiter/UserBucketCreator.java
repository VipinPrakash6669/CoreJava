package com.company.lld.apiRateLimiter;

import java.util.HashMap;
import java.util.Map;

public class UserBucketCreator {
    private Map<Integer,SlidingWindow> bucket;
    public UserBucketCreator(int id){
        bucket = new HashMap<>();
        bucket.put(id, new SlidingWindow(10,10));
    }

    void accessApplication(int id){
        if(bucket.get(id).grantAccess(id)){
            System.out.println(Thread.currentThread().getName()+" for user "+id+" able to access the application ");
        }else{
            System.out.println(Thread.currentThread().getName()+" for user "+id+" too many request please try after sometime ");
        }
    }
}
