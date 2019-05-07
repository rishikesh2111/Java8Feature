package com.java.feature.javafeature;

import java.util.concurrent.*;

public class ParallelandConcurrent {

    public static void main(String[] args){
/*        long total;
        ForkJoinPool pool = new ForkJoinPool(15);
        ForkJoinTask<Long> task = pool.submit(
                () -> LongStream.rangeClosed(1, 3_000_000).parallel().sum()
        );
        try{
            total = task.get();
            System.out.println("Total: "+total);
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            pool.shutdown();
        }
        int poolSize = pool.getPoolSize();
        System.out.println("Pool Size: "+poolSize);*/

        /*ExecutorService executorService = Executors.newCachedThreadPool();
        Future<String> future = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(100);
                return "hello world";
            }
        });
        System.out.println("processing....");
        getIfNotCancelled(future);*/
        System.out.println(testMethod(5, 0));


    }

    public static int testMethod(int a, int b){
        int res = 0;
        try{
            System.exit(0);
            res = a/b;
            System.out.println(res);
            return 6;
        }catch(Exception ex){
            ex.printStackTrace();
            System.exit(0);
            return 0;
        }finally {
            System.out.println("finally");
        }
    }

    private static void getIfNotCancelled(Future<String> future) {
        try{
            if(!future.isCancelled()){
                System.out.println(future.get());
            }else{
                System.out.println("Cancelled...");
            }
        }catch(InterruptedException | ExecutionException ex){
           ex.printStackTrace();
        }
    }
}
