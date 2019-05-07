package com.java.feature.javafeature;

import java.util.ArrayList;
import java.util.List;

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
