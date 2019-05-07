package com.java.feature.javafeature.concurency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadExample {


    public static void main(String[] args){
        System.out.println("Main Thread "+Thread.currentThread().getName());
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(new Task());
    }
}
class Task implements Callable<String>{
    public String call(){
        return Thread.currentThread().getName();
    }
}
