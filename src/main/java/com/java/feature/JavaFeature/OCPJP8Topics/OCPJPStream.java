package com.java.feature.JavaFeature.OCPJP8Topics;

import java.util.*;
import java.util.stream.Collectors;

public class OCPJPStream {

    public static void main(String[] args){
/*        List<Integer> values = Arrays.asList(110, 200, 90, 70, 600);

        values.stream().filter( i -> i > 100).forEach(System.out::println);

        List<String> names = Arrays.asList("Boi", "Cherish", "Zooye", "Bokeh", "Clover", "Aiko");
        names.stream().filter(name -> name.startsWith("B") || name.startsWith("C")).filter( name -> name.length() > 3)
                .forEach(System.out::println);*/

        List<Double> list = Arrays.asList(407.60, 609.0,406.0,505.60,305.20,405.50,409.50);
        List<Double> listEmpty = Arrays.asList();
       // OptionalDouble optDouble =  listEmpty.stream().mapToDouble(n -> n.doubleValue()).filter(n -> n > 406 && n < 408).average();
       // System.out.println(optDouble.getAsDouble());
/*        double sum =  listEmpty.stream().mapToDouble(n -> n.doubleValue()).sum();
        System.out.println("sum "+sum);
        double result = list.stream().mapToDouble(n -> n).peek(n -> System.out.println(n)).reduce(0.0, (a, b) -> a + b);
        System.out.println("result "+result);*/
       // System.out.println(list.stream().findFirst());

        Person person1 = new Person("rishi",32, "male");
        Person person2 = new Person("aj",36, "male");
        Person person3 = new Person("rakesh",42, "male");
        Person person4 = new Person("siddharth",22, "male");
        Person person5 = new Person("nidhi",42, "female");
        Person person6 = new Person("sangam",52, "male");
        Person person7 = new Person("archana",25, "female");
        Person person8 = new Person("sangam",45, "male");

        List<Person> persons = new ArrayList<>();
        persons.add(person1); persons.add(person2);persons.add(person3);persons.add(person4);persons.add(person5);persons.add(person6);persons.add(person7);persons.add(person8);

         Map<Integer, List<Person>> personMap = persons.stream().collect(Collectors.groupingBy(Person::getAge));
       //  System.out.println(personMap);
        // System.out.println(persons.stream().collect(Collectors.groupingBy(Person::getAge, Collectors.counting())));
        // System.out.println(persons.stream().collect(Collectors.groupingBy(Person::getAge, Collectors.mapping(Person::getName, Collectors.toList()))));
         Map<Boolean, List<Person>> personPartition = persons.stream().collect(Collectors.partitioningBy(person -> person.getGender().equalsIgnoreCase("male")));
       // System.out.println(personPartition);

     //   System.out.println(persons.stream().filter(p -> p.getName().startsWith("s")).collect(Collectors.summingInt(Person::getAge)));
      //  System.out.println(persons.stream().filter(p -> p.getName().startsWith("s")).collect(Collectors.averagingInt(Person::getAge)));
        //System.out.println(persons.stream().filter(p -> p.getAge() < 42).map(Person::getName).collect(Collectors.joining(" , ")));
        //persons.stream().collect(Collectors.maxBy( (p1, p2) -> p1.getAge() - p2.getAge())).ifPresent(System.out::println);
        int nums[] = {2,4, 5, 6, 7};
        System.out.println(Arrays.stream(nums).reduce(0, (n1, n2) -> n1 + n2));

    }
}

class Person {
    String name;
    int age;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}

class Dog{
    public Dog(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    String name;
    int age;
    int weight;
}