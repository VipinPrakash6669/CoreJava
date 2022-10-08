package com.company.lld.apiRateLimiter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Application {
    public static void main(String[] args) {
        UserBucketCreator userBucketCreator = new UserBucketCreator(1);
        UserBucketCreator userBucketCreator1 = new UserBucketCreator(2);
        ExecutorService executors = Executors.newFixedThreadPool(15);
        for(int i=0;i<15;i++){
            executors.execute(()-> userBucketCreator.accessApplication(1));
            executors.execute(()-> userBucketCreator1.accessApplication(2));

        }
        executors.shutdown();
    }
}
