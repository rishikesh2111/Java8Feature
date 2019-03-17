package com.java.feature.JavaFeature;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionPackageJava8 {


    public static void main(String[] args){/*
        DoubleSupplier doubleSupplier;
        doubleSupplier = () -> Math.random();
        System.out.println(doubleSupplier.getAsDouble());
        doubleSupplier = Math::random;
        System.out.println(doubleSupplier.getAsDouble());*/

        List<String> names = Arrays.asList("Mal", "wash","kaylee","Inara","Zoe","Jayne","Simon","River");
        /*Optional<String> first = names.stream().filter(name -> name.startsWith("C")).findFirst();
        System.out.println(first);
        System.out.println(first.orElse("None"));*/
       // System.out.println(getNameOfLength(5, names));
       // System.out.println(getNameStartingWith(names));
       /* names.stream().map(new Function<String, Object>() {
            @Override
            public Object apply(String s) {

                return s.length();
            }
        }).forEach(System.out::println);
        names.stream().map(s -> s.length()).forEach(System.out::println);
        names.stream().map(String::length).forEach(System.out::println);*/
        names.stream().mapToInt(String::length).forEach(System.out::println);

    }

    public static String getNameOfLength(int length, List<String> names){

       return names.stream().filter(name -> name.length() ==  length).collect(Collectors.joining(" ,"));
    }
    public static String getNameStartingWith(List<String> names){

        return names.stream().filter(name -> name.startsWith("S")).collect(Collectors.joining(" ,"));
    }
    public static String getNameSatisfyingCondition(List<String> names){

        return names.stream().filter(name -> name.startsWith("S")).collect(Collectors.joining(" ,"));
    }
}
