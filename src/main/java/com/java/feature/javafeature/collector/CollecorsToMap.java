package com.java.feature.javafeature.collector;

import java.util.*;
import java.util.stream.Collectors;

public class CollecorsToMap {

    public static void main(String[] args){
        Map<String, Integer> namesFrequency = new HashMap<>();
        List<String> names = Arrays.asList("rishi","nishi","kumar","aj","rishi","kumar","kumar","rakesh","nishi");

        names.stream().map(name -> name).filter( name -> name.length() == 5).collect(Collectors.toSet()).forEach(System.out::println);
        /*LinkedHashMap<String, Integer> nameMap = nameInMapWithCount(names);
        nameMap.forEach((k, v) -> System.out.println(k +" -> "+v));
        */
    }
    private static LinkedHashMap<String, Integer> nameInMapWithCount(List<String> names){
        return names.stream().collect(Collectors.toMap(k -> k, v -> 1, (s, a) -> a+1, LinkedHashMap::new));
    }
}

