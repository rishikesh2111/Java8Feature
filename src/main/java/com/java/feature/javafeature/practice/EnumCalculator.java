package com.java.feature.javafeature.practice;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.java.feature.javafeature.practice.Calc.*;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toSet;

public class EnumCalculator {

    public static void main(String[] args){
         System.out.println("x "+Calc.ADD.toString()+" y =>"+ Calc.ADD.apply(5,6));
         System.out.println(Calc.MULTIPLY.apply(5,6));
         System.out.println(Calc.DIVIDE.apply(5,6));
         System.out.println(Calc.SUBSTRACTION.apply(5,6));

         for(Calc val:Calc.values()){
             System.out.println("Value: "+val);
         }
         Map<String, String> merge = new HashMap<>();
         Stream.of(values()).collect(Collectors.toSet());
         //Objects.requireNonNull()
        // LinkedHashMap<String, Calc> operations = Stream.of(values()).collect(toMap(Object::toString, e -> LinkedHashMap::new)//;

    }
}

enum Calc{
    ADD("+"){
        public int apply(int x, int y){
            return x +y;
        }
    },
    MULTIPLY("*"){
        public int apply(int x, int y){
            return x * y;
        }
    },
    DIVIDE("/"){
        public int apply(int x, int y){
            return x +y;
        }
    },
    SUBSTRACTION("-"){
        public int apply(int x, int y){
            return x +y;
        }
    };
    private String symbol;

    Calc(String symbol){
        this.symbol = symbol;
    }
    @Override public String toString(){
        return symbol;
    }

    public abstract int apply(int x, int y);

}
