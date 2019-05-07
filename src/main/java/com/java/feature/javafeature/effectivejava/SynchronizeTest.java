package com.java.feature.javafeature.effectivejava;

import java.util.concurrent.TimeUnit;

public class SynchronizeTest {
    //private static boolean stopRequested;
    public static void main(String[] args) throws InterruptedException{
        Thread backgroundThread = new Thread(() -> {
            int i = 0;
            while(!StopThread.stopRequested()){
                i++;
            }
        });
        backgroundThread.start();
        TimeUnit.SECONDS.sleep(1);
       // stopRequested = true;
        StopThread.requestStop();
    }
}
class StopThread {

    private static boolean stopRequested;


    static synchronized void requestStop() {

        stopRequested = true;

    }


    static synchronized boolean stopRequested() {

        return stopRequested;

    }
}