package com.java.feature.javafeature.effectivejava;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaAndStreamWork {

    public static void main(String[] args){
        Map<String, Integer> namesFrequency = new HashMap<>();
        List<String> names = Arrays.asList("rishi","nishi","kumar","aj","rishi","kumar","kumar","rakesh","nishi");
        List<String> names1 = Arrays.asList("rishi","nishi","kumar","aj");
        LinkedHashMap<String, Integer> nameMap = nameInMapWithCount(names);
        nameMap.forEach((k, v) -> System.out.println(k +" -> "+v));
/*        for(String name:names){
          *//* if(namesFrequency.containsKey(name)){
               namesFrequency.put(name, namesFrequency.get(name)+1);
           }else{
               namesFrequency.put(name, 1);
           }*//*
          namesFrequency.merge(name, 1,Integer::sum);
            LinkedHashMap map = new LinkedHashMap();

        }*/
     //   System.out.println(namesFrequency);
      //  Map<String, Integer> maps = names.stream().collect(Collectors.toMap(k -> k, ));


    }

    private static LinkedHashMap<String, Integer> nameInMapWithCount(List<String> names){
       return names.stream().collect(Collectors.toMap(k -> k, v -> 1, (s, a) -> a+1, LinkedHashMap::new));
    }
}
