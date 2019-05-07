package com.java.feature.javafeature.collector;

import java.util.*;
import static java.util.stream.Collectors.*;

public class CollectorJoining {

    public static void main(String[] args){
        Map<String, Integer> namesFrequency = new HashMap<>();
        List<String> names = Arrays.asList("rishi","nishi","kumar","aj","rishi","kumar","kumar","rakesh","nishi");
        String joinedName = namesJoining(names);
        System.out.println(joinedName);

    }
    private static String namesJoining(List<String> names){
        return names.stream().collect(joining(", ","{","}"));
    }
}
