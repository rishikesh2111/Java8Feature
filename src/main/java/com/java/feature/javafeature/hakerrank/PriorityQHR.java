package com.java.feature.javafeature.hakerrank;
import java.util.*;
import java.util.ArrayList;
/*
 * Create the Student and Priorities classes here.
 */


public class PriorityQHR {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

      //  List<Student> students = priorities.getStudents(events);

       /* if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
       */  /*   for (Priorities.Student st: students) {
                System.out.println(st.getName());
            }*/
        }

}
class Priorities {
    List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> queue = new PriorityQueue<>(20, Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getName).thenComparing(Student::getId));
        for (String event : events) {
            String st[] = event.split(" ");
            if ("ENTER".equalsIgnoreCase(st[0])) {
                Student student = new Student(st[1], Double.valueOf(st[2]), Integer.valueOf(st[3]));
                queue.add(student);
            } else if ("SERVED".equalsIgnoreCase(st[0])) {
                queue.poll();
            }
        }
        List<Student> students = new ArrayList<>();
        Student first = queue.poll();
        if (first == null) {
            return students;
        } else {
            while (first != null) {

                students.add(first);
                first = queue.poll();

            }

            return students;
        }
    }

    class StudentComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            if (o1.getCgpa() > o2.getCgpa()) {
                return 1;
            } else if (o1.getCgpa() < o2.getCgpa()) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    class Student {
        private int id;
        private String name;
        private double cgpa;

        Student(String name, double cgpa, int id) {
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getCgpa() {
            return cgpa;
        }
    }
}