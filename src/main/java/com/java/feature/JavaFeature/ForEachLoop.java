package com.java.feature.JavaFeature;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachLoop {

    public static void main(String[] args){
        System.out.println("args");
        List<String> names = new ArrayList<>();
        names.add("Rishi");
        names.add("Nidhi");
        names.add("Shishir");
        names.add("Palak");
        names.add("Mohan");
        names.forEach(name ->{
                System.out.println("name "+name);
            }
        );

    }
}
