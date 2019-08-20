package com.java.feature.javafeature.goldman;

import java.util.*;

public class HighestAverage {

    public static void main(String[] args){

        String[][] array= {
            {"rishi","100"},{"rakesh","50"},{"rishi","98"},{"aj","89"}
        };
        List<Student> students = new ArrayList<>();
        for(String[] arr: array){
            students.add(new Student(arr[0], Float.valueOf(arr[1])));
        }
        students.forEach(System.out::println);
        // Need a map with student name as key and one list containing student index, number
        Map<String, List> stringListMap = new HashMap<>();

        for(Student student: students){
            if(stringListMap.containsKey(student.name)){
                List temp = stringListMap.get(student.name);
                Integer index =(Integer) temp.get(0);
                Float number = (Float)temp.get(1);
                temp.add(0,index+1);
                temp.add(1,number+student.number);
                stringListMap.put(student.name,temp);
            }else{
                List temp = new ArrayList();
                temp.add(0,1);
                temp.add(1,student.number);
                stringListMap.put(student.name, temp);
            }

        }

        System.out.println(stringListMap);
        Map<String, Float> averageScoreMap = new HashMap<>();
        for(Map.Entry<String, List> entry: stringListMap.entrySet()){
            Integer index = (Integer) entry.getValue().get(0);
            Float score = (Float) entry.getValue().get(1);
            Float avgScore = score/index;
            averageScoreMap.put(entry.getKey(),avgScore);
        }
        System.out.println(averageScoreMap);
        Float highest = 0F;
        for(Map.Entry<String, Float> map: averageScoreMap.entrySet()){
            if(map.getValue() > highest){
                highest = map.getValue();
            }
        }
        System.out.println(highest);
    }


    static class Student{
        String name;
        Float number;
        Student(String name, Float number){
            this.name = name;
            this.number =number;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", number=" + number +
                    '}';
        }
    }
}
