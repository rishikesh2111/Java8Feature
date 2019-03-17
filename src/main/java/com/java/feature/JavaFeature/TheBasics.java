package com.java.feature.JavaFeature;

import org.springframework.util.Assert;

import java.io.File;
import java.io.FilenameFilter;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TheBasics {
    public static void main(String[] args) {
       // System.out.println("outside thread");
/*        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("inside thread");
            }
        }).start();*/
        /*new Thread(() -> {System.out.println("inside thread");}).start();*/
        /*Runnable runnable = () -> System.out.println("inside thread");
        new Thread(runnable).start();*/
/*        File dir = new File(".\\src\\main\\java\\com\\gof\\example\\designpatternexamples\\composite");
        File[] filesList = dir.listFiles();
        System.out.println(Arrays.asList(filesList));
        File directory = new File(".\\src\\ma
        in\\java\\com\\gof\\example\\designpatternexamples\\composite ");
        String[] names = directory.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".java");
            }
        }); */
       /* File directory = new File(".\\src\\main\\java\\com\\gof\\example\\designpatternexamples\\composite ");
        String[] names = directory.list( (dir, name) -> {return name.endsWith(".java");});
        System.out.println(Arrays.asList(names));*/
/*        Stream.of(3, 1, 4, 1 ,5, 9).forEach(x -> System.out.println(x));
        Stream.of(3, 1, 4, 1 ,5, 9).forEach(System.out::println);
        Consumer<Integer> consumer = System.out::println;
        Stream.of(3,1,4,5,1,9).forEach(consumer);*/
       // Stream.generate(Math::random).limit(10).forEach(System.out::println);
       // List<String> strings = Arrays.asList("as", "but", "if", "okay", "fine","correct", "fine");
       // strings.stream().map(String::length).forEach(System.out::println);
        //strings.stream().sorted(String::compareTo).forEach(System.out::println);
       // List<String> wordList = strings.stream().sorted((s1, s2 )-> s1.compareTo(s2)).collect(Collectors.toList());
       // Set<String> wordList = strings.stream().sorted((s1, s2 )-> s1.compareTo(s2)).collect(Collectors.toCollection(LinkedHashSet::new));
        //System.out.println(wordList);
      //  List<String> names = Arrays.asList("Grass hooper", "Barbara Liskov", "Ada Lovelace", "Karen Jone");
       // List<Person> persons = names.stream().map(name -> name.split(" ")).map(Person::new).collect(Collectors.toList());
        //System.out.println(persons);
        //names.stream().map(name -> name.split(" ")).map(Person::new).forEach(System.out::println);
      //  Person[] personArray = names.stream().map(name -> name.split(" ")).map(Person::new).toArray(Person[]::new);
       // Arrays.stream(personArray).forEach(System.out::println);
        //List<Person> persons = names.stream().map(name -> new Person(name)).collect(Collectors.toList());
        //List<Person> persons = names.stream().map(Person::new).collect(Collectors.toList());
        //System.out.println(persons);
        //Person before = new Person("Marry");
       // List<Person> people = Stream.of(before).collect(Collectors.toCollection(LinkedList::new));
       // List<Person> people = Stream.of(before).map(Person::new).collect(Collectors.toList());

      //  Person after = people.get(0);
       // boolean test = before == after;
       // before.setName("grasshoper");
       // boolean nametest = "grasshoper".equals(after.getName());
       // assert "grasshoper".equals(after.getName()):"true";
       // System.out.println(nametest);
      //  System.out.println(after.getName());

        List<String> strings = Arrays.asList("this","is","a","list","of", "strings");
        strings.forEach(System.out::println);




    }

    static class Person{
        private String name;

        public Person() {
        }
        public Person(String ... names) {
            this.name = Arrays.stream(names).collect(Collectors.joining(" "));
        }
        public Person(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
