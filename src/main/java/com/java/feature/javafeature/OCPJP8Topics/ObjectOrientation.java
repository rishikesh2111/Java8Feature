package com.java.feature.javafeature.OCPJP8Topics;

public class ObjectOrientation {

    public static void main(String[] args){
        /*UseAnimal ua = new UseAnimal();
        Animal animal = new Animal();
        Horse horse = new Horse();
        Animal animal1 = new Horse();
        ua.doStuff(animal1);
        ua.doStuff(new Animal());
        ua.doStuff(new Horse());*/
      /* Animal animal[] = {new Animal(), new DogA(), new Animal()};
       for(Animal a: animal){
           a.makeNoise();
           if(a instanceof DogA){
               ((DogA) a).playDead();
           }
       }*/
      C1 obj = new C1();
      obj.print();
      I1 objI = new C1();
      objI.print();
    }
}
class C1 implements I1, I2{
    public void print(){
        System.out.println("print C1");
    }
}
interface I1{
    default void print(){
        System.out.println("print I1");
    }
}

interface I2{
    default void print(){
        System.out.println("print I2");
    }
}


class UseAnimal{

    public void doStuff(Animal a){
        System.out.println("Animal");
    }
    public void doStuff(Horse a){
        System.out.println("Horse");
    }
}

class Animal{
public void makeNoise(){
    System.out.println("Make noise");
}

}
class DogA extends Animal{

    public void makeNoise(){
        System.out.println("Make noise doga");
    }
    public void playDead(){
        System.out.println("play dead ");
    }
}
class Horse extends Animal{
    public void eat(){
        System.out.println("Horse eat");
    }
    public void eat(String apple){
        System.out.println("Horse eat "+apple);
    }
}

