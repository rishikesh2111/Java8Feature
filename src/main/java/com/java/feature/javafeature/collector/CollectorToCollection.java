package com.java.feature.javafeature.collector;

import java.util.*;

import static java.util.stream.Collectors.*;

import java.util.stream.Stream;

public class CollectorToCollection {

    public static void main(String[] args){
        Stream<Integer> number = Stream.of(5,8,9,3,4,7,2,11,23,80);
        Stream<String> names = Stream.of("rishi", "kumar","nidhi","rishi","siddharth","kumar");
        Stream<Person> persons = Stream.of(
                new Person("Rishi", 1001),
                new Person("kumar", 1005),
                new Person("nidhi", 1012),
                new Person("kumar", 1005),
                new Person("rakesh",1034),
                new Person("nidhi", 1012),
                new Person("siddharth",1006)
        );
       // getTreeSet(persons).forEach(System.out::println);
      /*  Map personMap = getHashMap(persons);
        personMap.forEach((k, v) -> System.out.println(v));*/

       // Map<Integer, List<Person>>  personMap = groupingByList(persons);
        //personMap.forEach((k ,v) -> System.out.println(k +"  "+v));
      //  partitioningByMap(persons).forEach((k, v) -> System.out.println(k+" "+v));
        mappingList(persons).forEach(System.out::println);
    }
    private static Map getHashMap(Stream<Person> personStream){
        return personStream.collect(toMap( person -> person.getId(), value -> value ,(map, element) -> element, TreeMap::new));
    }
    private static LinkedList<Object> getLinkedList(Stream<Person> personStream){
        return personStream.collect(toCollection(LinkedList::new));
    }

    private static TreeSet getTreeSet(Stream<Person> personStream){
      return personStream.collect(toCollection(() -> new TreeSet<>()));
    }
    public static Map<Boolean, List<Person>> partitioningByMap(Stream<Person> personStream){
      return personStream.collect(partitioningBy(p -> p.getId() % 2 == 0 ));
    }
    public static Map<Integer, Set<Person>> groupingByMap(Stream<Person> persons){
             return persons.collect(groupingBy(k -> k.getId(), LinkedHashMap::new , mapping(person -> person, toSet())));

    }
    public static Map<Integer, Set<Person>> groupingBySet(Stream<Person> persons){
         return persons.collect(groupingBy(person -> person.getId(), mapping(p -> p, toSet())));
    }
    public static Map<Integer, List<Person>> groupingByList(Stream<Person> persons){
        Map<Integer, List<Person>> name = persons.collect(groupingBy(Person::getId));
         return name;
    }
    public static  List<Person> mappingList(Stream<Person> persons){
       return persons.collect(mapping(p -> p, toList()));
        //Map<Integer, List<Person>> name = persons.collect(groupingBy(Person::getId));
       // return name;
    }
    public static  void reducingList(Stream<Person> persons){
      //  persons.collect(reducing(Function.identity(), toList()));
        //Map<Integer, List<Person>> name = persons.collect(groupingBy(Person::getId));
        // return name;
    }
}

class Person implements Comparable<Person>{
    String name;
    int id;

    @Override
    public int compareTo(Person person){
        /*if(getId() > person.id){
            return 1;
        }else if(getId() < person.id){
            return -1;
        }else {
            return 0;
        }*/
        return getId() - person.id;
    }
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int hashCode(){
        return 101;
    }
    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        Person person = (Person)obj;
        return person.getName().equalsIgnoreCase(this.getName());
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}