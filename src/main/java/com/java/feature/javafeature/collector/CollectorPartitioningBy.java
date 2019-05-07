package com.java.feature.javafeature.collector;

import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.*;
import java.util.stream.Stream;

public class CollectorPartitioningBy {

    public static void main(String[] args){
        Stream<Integer> number = Stream.of(5,8,9,3,4,7,2,11,23,80);
        Stream<String> names = Stream.of("rishi", "kumar","nidhi","rishi","siddharth","kumar");
        Map<Boolean, List<Integer>> maps = number.collect(partitioningBy(n ->  n % 2 == 0));
        System.out.println(maps);
    }

    public static void checkPartitioningBy(){

    }
    public static void checkGroupingBy(){

    }
}
