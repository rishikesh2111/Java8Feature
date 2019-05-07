package com.java.feature.javafeature.hakerrank.BNY;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListUpdateTest {
    public static void updateList(List<Integer> list) {
        // Implement this method as per the required logic //10 20 5 30 4 20 60 40 8 6 22 9 7 50
         for(int j = 0; j < list.size(); j++) {
             for (int i = 1; i < list.size() - 1; i++) {
                 int prev = list.get(i - 1);
                 int next = list.get(i + 1);
                 int current = list.get(i);
                 if (prev > current && next > current) {
                     list.remove(i);
                 }
             }
         }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        scanner.close();
        String[] values = inputStr.split("\\s");

        List<Integer> list = new ArrayList<Integer>();
        for (String str : values) {
            list.add(new Integer(str));
        }

        updateList(list);

        System.out.println(list);
    }
}
