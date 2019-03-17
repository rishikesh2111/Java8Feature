package com.java.feature.JavaFeature;

import java.math.BigDecimal;
import java.security.cert.CollectionCertStoreParameters;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.IntStream.of;

public class StreamsJava8 {

   public static void main(String[] args){
      // String names = Stream.of("Gomex","Morticia","wednesday","parsley","kutia").collect(Collectors.joining());
       //System.out.println(names);
      // List<BigDecimal> numbers =
    //   Stream.iterate(BigDecimal.ONE , n -> n.add(BigDecimal.ONE)).limit(10).forEach(System.out::print);
      // Stream.iterate(LocalDate.now(), date -> date.plusDays(1L)).limit(5).forEach(System.out::println);
     //  Stream.generate(Math::random).limit(5).forEach(System.out::print);

      // List<Integer> ints =
             //  IntStream.rangeClosed(10, 15).forEach(System.out::print);
                       //.boxed().forEach(System.out::print);
       /*IntStream.of(2, 5, 7, 9, 11, 12, 10, 18, 19).filter( n -> n % 3 == 0).mapToObj(Integer::new).forEach(System.out::print);
      List<Integer> ints =  IntStream.of(5, 9, 8, 10, 23, 21).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
      int[] intArray = IntStream.of(5, 8, 9 , 10).toArray();
      System.out.println(intArray);*/
      // String[] strings = "this is an array of Strings".split(" ");
      // long count = Arrays.stream(strings).map(Function.identity()).count();
       //OptionalInt max = Arrays.stream(strings).mapToInt(String::length).max();
       //int sum = Arrays.stream(strings).mapToInt(String::length).sum();
       //OptionalDouble average = Arrays.stream(strings).mapToInt(String::length).average();
       //System.out.println(average.getAsDouble());
       //System.out.println(sum);
/*      int sumStream =IntStream.rangeClosed(2, 7).reduce( (x, y) -> x + y).orElse(5);
       System.out.println(sumStream);
       IntStream.rangeClosed(5, 10).reduce(
               (x, y) ->{
                   System.out.println(x+y);
                return x +y;
               }).orElse(0);*/
  /*   int sum = Stream.of(1, 2, 3, 4, 5, 6 , 7, 8 ,9).reduce(0, Integer::sum);
     System.out.println(sum);
     int max = Stream.of(5, 6, 8, 10, 3, 4).reduce(Integer::max).orElse(0);
     System.out.println(max);
     String s = Stream.of("this","is","a","list").reduce(" ",String::concat);
       System.out.println(s);*/
//  BigDecimal total = Stream.iterate(BigDecimal.ONE, n -> n.add(BigDecimal.ONE)).limit(10)
  //        .reduce(BigDecimal.ONE ,(a, b) -> a.add(b));
   //System.out.println(new StreamsJava8().sumDoublesDivisibleBy3(1, 10));
  // System.out.println(new StreamsJava8().sumDoublesDivisibleBy3Peek(1, 5));
     // IntSummaryStatistics intSummaryStatistics = IntStream.rangeClosed(1, 6).summaryStatistics();
     // System.out.println(intSummaryStatistics);
      List<String> names = Arrays.asList("Rishi","Nidhisharma","krishna","rami","shyam");
    //  Map<Boolean, Long> maps =
      //        names.stream()
        //      .collect(Collectors.partitioningBy(n -> n.length() % 2 == 0, Collectors.counting()));
     // System.out.println(maps);
     // Map<Boolean, Long> mapInt = IntStream.of(4, 6, 8, 9, 10).boxed().collect(Collectors.partitioningBy(n -> n % 2 == 0, Collectors.counting()));
     // Map<Boolean, List<String>> maps = names.stream().collect(Collectors.partitioningBy(n -> n., Collectors.counting()));
     // System.out.println(maps);
    // Optional<Integer> first = Stream.of(5, 4, 6, 8, 10, 11).filter(n -> n % 2 == 0).findFirst();
    // System.out.println(first);
    // Stream<String> first = Stream.of("one", "two", "three");
    // Stream<String> second = Stream.of("four", "five", "six");
    // Stream<String> third = Stream.of("seven", "eight");
   //   String number = Stream.concat(first, second).collect(Collectors.joining(" "));
    // System.out.println(number);
    // String flatmapnumber = Stream.of(first, second, third).flatMap(Function.identity()).collect(Collectors.joining(" "));
     // System.out.println(flatmapnumber);
/*      OptionalInt first = IntStream.range(100, 200)
              .peek(n -> System.out.println(n))
              .map(n -> n * 2)
              .peek(n -> System.out.println(n))
              .filter(n -> n % 3 == 0)
              .peek(n -> System.out.println(n))
              .findFirst();
      System.out.println(first);*/
      Customer rishi = new Customer("Rishi");
      Customer nidhi = new Customer("nidhi");
      Customer viren = new Customer("viren");
      rishi.addOrder(new Order(100));
      rishi.addOrder(new Order(200));
      rishi.addOrder(new Order(300));
      viren.addOrder(new Order(500));
      viren.addOrder(new Order(600));
      List<Customer> customers = Arrays.asList(rishi, nidhi, viren);
     // customers.stream().map(Customer::getName).forEach(System.out::println);
      customers.stream().map(customer -> customer.getOrders().stream()).forEach(System.out::println);
      //customers.stream().map(Customer::getOrders).forEach(System.out::println);
      customers.stream().flatMap(customer -> customer.getOrders().stream()).forEach(System.out::println);


   }

   static class Customer{
      private String name;
      private List<Order> orders = new ArrayList<>();

      public Customer(String name){
         this.name = name;
      }

      public String getName() {
         return name;
      }

      public void setName(String name) {
         this.name = name;
      }

      public List<Order> getOrders() {
         return orders;
      }
      public Customer addOrder(Order order){
         orders.add(order);
         return this;
      }

      @Override
      public String toString() {
         return "Customer{" +
                 "name='" + name + '\'' +
                 '}';
      }
   }
   static class Order{
      private int id;
      public Order(int id){
         this.id = id;
      }

      public int getId(){
         return id;
      }

      @Override
      public String toString() {
         return "Order{" +
                 "id=" + id +
                 '}';
      }
   }

   public int sumDoublesDivisibleBy3(int start, int end){
       return IntStream.rangeClosed(start, end).
               map(n -> {
                  System.out.println(n);
                  return n;
               })
               .map(n -> n * 2).filter(n -> n % 3 == 0).sum();
   }
   public int sumDoublesDivisibleBy3Peek(int start, int end){
      return IntStream.rangeClosed(start, end)
              .peek(n -> System.out.println(n))
              .map(n -> n * 2)
              .peek(n -> System.out.println(n))
              .filter(n -> n % 3 == 0)
              .peek(n -> System.out.println(n))
              .sum();
   }

   public boolean isPalindrom(String s){
      StringBuilder sb = new StringBuilder();
      for(char c: s.toCharArray()){
         if(Character.isLetterOrDigit(c)){
             sb.append(c);
         }
      }
      String forward = sb.toString().toLowerCase();
      String backward = sb.reverse().toString().toUpperCase();
      return forward.equals(backward);
   }

   public boolean isPalindromStream(String s){
      String forward = s.toLowerCase().codePoints()
              .filter(Character::isLetterOrDigit)
              .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
              .toString().toLowerCase();
      String backward = new StringBuilder(forward).reverse().toString();
      return forward.equals(backward);
   }
}
