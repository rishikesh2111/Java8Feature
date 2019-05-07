package com.java.feature.javafeature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingTest {

    public static void main(String[] args){
      Worker worker1 = new Worker("Rishi", 100);
      Worker worker2 = new Worker("Rakesh", 109);
      Worker worker3 = new Worker("Abhishek", 109);
      Worker worker4 = new Worker("AJ", 104);
      Worker worker5 = new Worker("Siddharth", 102);
      List<Worker> workers = new ArrayList<>();
      workers.add(worker1);workers.add(worker2);workers.add(worker3);workers.add(worker4);workers.add(worker5);
        System.out.println(workers);
       // Collections.sort(workers, new WorkerComparatorById());
        Collections.sort(workers, (w1, w2) -> w1.getId() - w2.getId());
        System.out.println("Sorted ID: "+workers);
        Collections.sort(workers, (w1, w2) -> w1.getName().compareToIgnoreCase(w2.getName()));
      //  Collections.sort(workers, new WorkerComparatorById().thenComparing(new WorkerComparatorByName()));
        Comparator<Worker> workerCompareById = (w1, w2) -> w1.getId() - w2.getId();
        Comparator<Worker> workerComparatorByName = (w1, w2) -> w1.getName().compareToIgnoreCase(w2.getName());
        Collections.sort(workers, workerCompareById.thenComparing(workerComparatorByName));
        System.out.println("Sorted ID than NAME: "+workers);


    }
}

class WorkerComparatorById implements Comparator<Worker> {

    @Override
    public int compare(Worker o1, Worker o2) {
        return o1.getId() - o2.getId();
    }
}

class WorkerComparatorByName implements Comparator<Worker> {

    @Override
    public int compare(Worker o1, Worker o2) {
        return o1.getName().compareToIgnoreCase(o2.getName());
    }
}
class Worker {

    private String name;
    private int id;

    public Worker(String name) {
        this.name = name;
    }
    public Worker(int id) {
        this.id = id;
    }
    public Worker(String name, int id) {
        this.name = name;
        this.id = id;
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

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
