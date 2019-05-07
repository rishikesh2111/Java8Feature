package com.java.feature.javafeature.collector;

import java.util.*;
import static java.util.stream.Collectors.*;

public class CollectorCounting {

    public static void main(String[] args){
        Map<String, Integer> namesFrequency = new HashMap<>();
        StringJoiner joiner = new StringJoiner("");
        List<String> names = Arrays.asList("rishi","nishi","kumar","aj","rishi","kumar","kumar","rakesh","nishi");

            }
    private static long countName(List<String> names){
        return names.stream().collect(counting());
    }
}
