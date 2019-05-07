package com.java.feature.javafeature;

import java.util.*;

public class GenericsFeature {
    public static void main(String[] args){

       // List<? extends Animal> animal = new ArrayList<>();
       // ArrayList<? super Animal> superanimal = new ArrayList<>();
       //animal.add(new Tiger("tiger"));
       // superanimal.add(new Animal());
       // superanimal.add(new Tiger());
       // superanimal.add(new AIEnabledTiger());
       // Arrays.asList();
      //  List lst = Arrays.asList("one","two");
        /*List lst = new ArrayList();
        lst.add(0, "zero");
        lst.add(1, "three");
        lst.remove( 1);

        Comparator<Animal> animalComparator = (e1, e2) -> { return 0;};*/

        Animal animal1 = new Animal(101,"tiger");
        Animal animal2 = new Animal(109,"monkey");
        Animal animal3 = new Animal(115,"cow");
        Animal animal4 = new Animal(117,"deer");
        Animal animal6 = new Animal(113,"deer");
        Animal animal5 = new Animal(103,"elephant");

        List<Animal> animals = new ArrayList<>();
        animals.add(animal1);
        animals.add(animal2);animals.add(animal3);animals.add(animal4);animals.add(animal5);animals.add(animal6);
        Comparator<Animal> animalComparator = (a1, a2) -> a1.getName().compareTo(a2.getName());
        Collections.sort(animals, new ChainingComparatorAnimal());
        System.out.println(animals);
    }


}

class ChainingComparatorAnimal implements Comparator<Animal>{

    public int compare(Animal a1, Animal a2){
       Comparator<Animal> comp = Comparator.comparing(animal -> animal.getName());
       comp =comp.thenComparing(animal -> animal.getId());
       return comp.compare(a1, a2);
    }
}

class Animal{
    public Animal(String name) {
        this.name = name;
    }
    public Animal() {
    }

    public Animal(int id, String name) {
        this.id = id;
        this.name = name;
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

    int id;
    String name;

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
class Tiger extends Animal{

    public Tiger() {
    }

    public Tiger(String name) {
        super(name);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    private String category;
}
class AIEnabledTiger extends Tiger{

    public AIEnabledTiger() {
    }

    public AIEnabledTiger(String name) {
        super(name);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    private String category;
}
