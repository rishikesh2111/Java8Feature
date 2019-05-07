package com.java.feature.javafeature;

import java.util.*;
import java.util.function.*;

public class JavaLambda {

    public static void main(String[] args){
/*        Supplier<Integer> supplier = () -> 42;
        System.out.println(supplier.get());

        Random random = new Random();
        IntSupplier supplier1 = () -> random.nextInt(10);
        System.out.println(supplier1.getAsInt());

        Consumer<String> consumer = pill -> {
            if(pill.equals("red")){
                System.out.println("red pill");
            }else{
                System.out.println("blue pill");
            }
        };

        consumer.accept("red");
        Map<String, String> env = System.getenv();
        BiConsumer<String, String> consumer1 = (k, v) ->{
            System.out.println(k+"   "+ v);
        };
        consumer1.accept("USER", env.get("SYSTEM"));*/
     /*   List<String> dogNames = Arrays.asList("boi", "clever", "zooye");
        Consumer<String> dogNames1 =s -> System.out.println(s);
        dogNames.forEach(dogNames1);
     */
/*

     List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("zoie",101,20));
        dogs.add(new Dog("moti",102,30));
        dogs.add(new Dog("hira",103,40));
        dogs.add(new Dog("kutta",99,10));
        dogs.add(new Dog("kaliya",75,90));
        dogs.add(new Dog("seru",119,70));


        Consumer<Dog> displayName = dog -> System.out.println(dog.getName());
        Consumer<Dog> dogBark = dog -> dog.bark();

        Predicate<Dog> namePredicate = dog -> dog.getName().startsWith("k");
        Predicate<Dog> agePredicate = dog -> dog.getAge() < 100;
        Predicate<Dog> weightPredicate = dog -> dog.getWeight() < 50;

        Dog zoie = new Dog("zoie",101,20);
        Dog dogie = new Dog("zoie",101,20);

        Predicate equalTest = Predicate.isEqual(zoie);
        System.out.println(equalTest.test(dogie));

        printDogIf(dogs, namePredicate, agePredicate, weightPredicate);
*/

/*
      List<Book> books = new ArrayList<>();
      books.add(new Book("java", 55.0));
        books.add(new Book("react", 95.0));
        books.add(new Book("ocpjp", 85.0));
        books.add(new Book("angular", 65.0));
        books.add(new Book("spring", 35.0));

        BiPredicate<String, Double> namePred = (book, price )-> book.contains("java");
        BiPredicate<String, Double> pricePred = (book, price) -> price.doubleValue() <= 55.0;
        BiPredicate<String, Double> definiteBuy = namePred.and(pricePred);

        books.forEach(book -> {
            if(definiteBuy.test(book.getName(), book.getPrice())){
                System.out.println(book);
            }
        });
*/

    /*Function<Integer, String> function = num -> num.intValue() == 42? "forty two":"Garbage";
    System.out.println(function.apply(42));
        System.out.println(function.apply(44));
        BiFunction<String, String, String> biFunction = (str1, str2) ->  str1 + ""+ str2;
        System.out.println(biFunction.apply("Rishi", "kumar"));*/

       Map<String, String> map = new HashMap<>();
        map.computeIfAbsent("101", (str) -> "Rishi kumar");
        map.computeIfAbsent("102", (str) -> "Nidhi Sharma");
        map.computeIfAbsent("102", (str) -> "Shishir kumar");
        map.replaceAll((key, oldVal) -> oldVal.toUpperCase());
        map.forEach((k, v) -> System.out.println(k+" "+v));



    }

    public static void printDogIf(List<Dog> dogs, Predicate<Dog> namePredicate, Predicate<Dog> agePredicate, Predicate<Dog> weightPredicate){
         dogs.stream().filter(namePredicate.or(weightPredicate)).forEach(System.out::println);
    }

}

class Book {
    String name;
    Double price;

    public Book(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

interface DogQuerier {
    public boolean test(Dog dog);
}
class Dog{
    private String name;
    private int age;
    private int weight;

    public Dog(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void bark(){
        System.out.println("whoof....");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age &&
                weight == dog.weight &&
                name.equals(dog.name);
    }

    @Override
    public int hashCode() {
        return 100;
       // return Objects.hash(name, age, weight);
    }
}