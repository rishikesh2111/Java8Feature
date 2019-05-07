package com.java.feature.javafeature.effectivejava;

import java.util.concurrent.*;

public class ExecutorExample {

    public static void main(String[] args)throws InterruptedException, ExecutionException {
/*        Thread thread1 = new Thread(new Task());
        Thread thread2 = new Thread(new Task());
        thread1.start();
        thread2.start();
        System.out.println("Task "+Thread.currentThread().getName()+" executing");

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new Task());
        executorService.submit(new Task());
        executorService.shutdown();*/
         ExecutorService executorService = Executors.newSingleThreadExecutor();
         Future<Integer> future = executorService.submit(new CallableTask(8));
      //  System.out.println("future.isDone(): "+future.isDone());
       // System.out.println("Square of num ext: "+future.get());
          while(!future.isDone()){
            System.out.println("Square of num int: "+future.get());
         }
/*        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(" test ");
            }
        });*/

        executorService.shutdown();
        CompletableFuture completableFuture = CompletableFuture.runAsync(new Task());
        System.out.println(completableFuture.get());

    }
}
class CallableTask implements Callable<Integer>{
    int num;
    CallableTask(int n){
        num = n;
    }

    public Integer call()throws InterruptedException {
        Thread.sleep(1000);
       // System.out.println("num = "+num);
        return num * num;
    }
}
class Task implements Runnable{

    public void run(){
        System.out.println("Task "+Thread.currentThread().getName()+" executing");
    }
}

