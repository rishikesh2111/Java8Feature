package com.java.feature.javafeature;

import java.net.URLEncoder;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IssueWithStream {

    public static void main(String[] args){
      //  List<Integer> number = Arrays.asList(4, 6, 8, 9 , 12, 10, 5);
       // number.forEach(System.out::println);
        List<Employee> employees = Arrays.asList(
                new Employee(1001, "rishi", "devops", 1500000D),
                new Employee(1002, "rakesh", "service", 1900000D),
                new Employee(1003, "siddharth", "ui", 1700000D),
                new Employee(1004, "aj", "service", 1600000D)
        );
       // employees.forEach(System.out::println);
       //Map<Integer, Employee> employeeMap =  employees.stream().collect(Collectors.toMap(emp -> emp.getEmpId(), emp -> emp));
       //employeeMap.forEach((id, emp) -> System.out.println(id +"  "+ emp));
/*
        Function<Integer, Integer> add2 = x -> x+2;
        Function<Integer, Integer> mul3 = x -> x * 3;
        Function<Integer, Integer> mul3add2 = add2.compose(mul3);
        Function<Integer, Integer> add2mul3 = add2.andThen(mul3);
        System.out.println(mul3add2.apply(1));
        System.out.println(add2mul3.apply(1));*/
        /*IntPredicate triangular = IssueWithStream::isTriangular;
        IntPredicate isPerfect = IssueWithStream::isPerfect;
        IntPredicate both = triangular.and(isPerfect);
        IntStream.rangeClosed(1, 10_000).filter(isPerfect).forEach(x -> System.out.print(" "+x));
        System.out.println();
        IntStream.rangeClosed(1, 10_000).filter(triangular).forEach(x -> System.out.print(" "+x));
        System.out.println();
        IntStream.rangeClosed(1, 10_000).filter(both).forEach(x -> System.out.print(" "+x))*/;
          /*List<Integer> values = Arrays.asList(5, 10, 15, 67, 90, 30, 20);
          List<Integer> scaled = div(values, 10);
          System.out.println(scaled);
          scaled = div(values, 0);
          System.out.println(scaled);*/
          List<String> urls = Arrays.asList("google.com");
          urls.stream().map(url ->  encodeUrl(url)).collect(Collectors.toList());
    }

    private static String encodeUrl(String url) {
        try {
            return URLEncoder.encode(url, "UTF-8");
        }catch (Exception ex){
            throw new RuntimeException();
        }
    }

    public static List<Integer> div(List<Integer> values, Integer factor){
        return values.stream()
                .map(value -> {
                            return divide(factor, value);
                        }
                )
                .collect(Collectors.toList());
    }

    private static Integer divide(Integer factor, Integer value) {
        try {
            return value / factor;
        } catch (Exception ex) {
            System.out.println(" divide be zero");
        }
        return null;
    }

    public static boolean isPerfect(int x){
        return Math.sqrt(x) % 1 == 0;
    }
    public static boolean isTriangular(int x){
        double val= (Math.sqrt(8 * x +1 )- 1) / 2;
        return val % 1 == 0;
    }

    //public static void main(String[] args){
     //IssueWithStream issueWithStream = new IssueWithStream();
    // System.out.println(issueWithStream.nonNullString());
    //}
/*    public String nonNullString(){
        return Arrays
                .asList("this","is",null, "a","non",null,"null","string", null)
                .stream()
                .filter(Objects::nonNull)
                .collect(Collectors.joining(" "));
    }*/
}
