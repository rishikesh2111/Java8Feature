package com.java.feature.javafeature.collector;

import java.util.Comparator;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class CollectorsMinBy {

    public static void main(String[] args){
        Stream<Integer> number1 = Stream.of(5,8,9,3,4,7,2,11,23,80);
        number1.collect(minBy(Comparator.naturalOrder())).ifPresent(System.out::println);
        Stream<Integer> number2 = Stream.of(5,8,9,3,4,7,2,11,23,80);
        Double num = number2.collect(averagingInt(Integer::intValue));
        System.out.println("Average "+num);
        Stream<Integer> number3 = Stream.of(5,8,9,3,4,7,2,11,23,80);
        number3.collect(maxBy(Comparator.naturalOrder())).ifPresent(System.out::println);
    }
}
