package com.java.feature.javafeature.OCPJP8Topics;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class ConcurrencyPractice {

    public static void main(String[] args)throws Exception{

/*          List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

          OptionalDouble avgRed = numbers.parallelStream().mapToDouble(n -> n).reduce((n1, n2) -> (n1+n2)/2);
          avgRed.ifPresent(a -> System.out.println("average with reduec: "+avgRed));
          OptionalDouble avg = numbers.parallelStream().mapToDouble( n-> n).average();
          avg.ifPresent(s -> System.out.println("Average with avg: "+avg));*/

       /*  List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sum = nums.parallelStream().peek(n -> {
           System.out.println(n + " : "+Thread.currentThread().getName());
         }).mapToInt(n -> n).sum();*/
/*       System.out.println("Started");
        List<Integer> numbers =  new ArrayList<>();
        for(int i=1; i< 1000000; ){
            numbers.add(i);
           // Thread.sleep(5);
            i++;
        }
         System.out.println("Completed");
         Instant start = Instant.now();
        long sum = numbers.stream().mapToInt(n -> n).sum();
        Instant end = Instant.now();
        System.out.println("Sum:  "+sum);
        System.out.println("Time taken: "+Duration.between(start,end).getNano());


        Instant start1 = Instant.now();
        long sum1 = numbers.parallelStream().mapToInt(n -> n).sum();
        Instant end1 = Instant.now();
        System.out.println("Sum1:  "+sum1);
        System.out.println("Time taken: "+Duration.between(start1,end1).getNano());*/
/*        ForkJoinPool fjp = new ForkJoinPool(2);
            try{
            int sum1 = fjp.submit(() -> nums.stream().parallel().peek(n -> {
                System.out.println(n + " : "+Thread.currentThread().getName());
            }).mapToInt(n -> n).sum()).get();
        }
            catch (InterruptedException |ExecutionException e){
                e.printStackTrace();
            }*/
        /*CopyOnWriteArrayList<Integer> cowList = new CopyOnWriteArrayList<>();
        cowList.add(4);
        cowList.add(2);
        Iterator<Integer> itr = cowList.iterator();
        cowList.add(6);
        Iterator<Integer> itr1 = cowList.iterator();
        cowList.remove(2);
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }*//*
        ConcurrentMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("john", 23);
        map.remove("john",23);
        System.out.println(map);*//*
        ThreadLocalRandom random = ThreadLocalRandom.current();
        System.out.println(random.nextInt(1, 11));
        System.out.println(random.nextInt(1, 11));
        System.out.println(random.nextInt(1, 11));*//*
        AtomicInteger i = new AtomicInteger();
        System.out.println(i.addAndGet(9));*/
 /*       ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Integer> fut = executorService.submit(new Callable<Integer>() {
            public Integer call(){
                return 5;
            }
        });*/
/*        Stream<Integer> nums = Stream.of(10, 5,3, 2);
        Optional<Integer> opt = nums.parallel().map(n -> n * 10).peek(n -> System.out.println(n)).reduce((n1, n2) -> {
          System.out.println(n1+" "+n2+"  "+(n1-n2));
            return n1 -n2;
        });
        System.out.println(opt.get());*/
  /*Stream<List<String>> sDogNames = Stream.generate( () ->
          Arrays.asList("boi","aiko","cherris","zoei","clover")).limit(2).unordered();
  sDogNames.parallel().flatMap(s -> s.stream())
          .map(s -> s.toUpperCase())
          .forEach(s -> System.out.println(s + " "));
   */
/*    List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        OptionalInt aNum = nums.parallelStream().mapToInt(i -> i *2).findAny();
        System.out.println(aNum.getAsInt());*/
      /*  ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        lock.readLock().unlock();*/
      System.out.println("start");
        Count count = new Count();
        IntStream stream = IntStream.range(0, 500);
        int sum = stream.parallel().filter(i -> {
           if(i %10 ==0){
               count.counter.incrementAndGet();
               return true;
           }
           return false;
        }).sum();

        System.out.println("Sum:  "+sum+"   count: "+count.counter);
    }


}
class Count{
    AtomicInteger counter = new AtomicInteger(0);
}

