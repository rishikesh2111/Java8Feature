package com.java.feature.javafeature.collector;

import java.util.*;
import static java.util.stream.Collectors.*;

public class CollectingAndThan {

    public static void main(String[] args){
        Map<String, Integer> namesFrequency = new HashMap<>();
        List<String> names = Arrays.asList("rishi","nishi","kumar","aj","rishi","kumar","kumar","rakesh","nishi");
        /*Map<String, Integer> nameMap = nameInMapWithCount(names);
        nameMap.forEach((k, v) -> System.out.println(k +" -> "+v));
        nameMap.put("value",0);
        nameMap.forEach((k, v) -> System.out.println(k +" -> "+v));
        */
        Set<String> setOfName = nameInSet(names);
        System.out.println(setOfName);
        List<String> listOfName = nameInList(names);
        System.out.println(listOfName);
    }
    private static List<String> nameInList(List<String> names){
        return names.stream().collect(collectingAndThen(toList(),Collections::<String> unmodifiableList));

    }

    private static Set<String> nameInSet(List<String> names){
        return names.stream().collect(collectingAndThen(toSet(),Collections::<String> unmodifiableSet));

    }
    private static Map<String, Integer> nameInMapWithCount(List<String> names){
       return names.stream().collect(collectingAndThen(toMap(k-> k, v-> 1, (a,b) -> b+1),Collections::<String, Integer> unmodifiableMap));

    }
}
