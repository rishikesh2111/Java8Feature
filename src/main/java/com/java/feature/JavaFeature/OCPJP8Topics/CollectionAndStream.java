package com.java.feature.JavaFeature.OCPJP8Topics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionAndStream {

    public static void main(String[] args){
        Set<Number> numbers = new HashSet<>();
        numbers.add(new Integer(56));
        numbers.add(89);
        numbers.add(new Integer(34));
        numbers.add(null);
        numbers.add(30L);

        Iterator itr = numbers.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
