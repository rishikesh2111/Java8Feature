package com.java.feature.javafeature.hakerrank;
import java.util.*;
public class DequeHR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new LinkedList();
        int n = in.nextInt();
        int m = in.nextInt();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
        }
        Set set = null;
        List list = new ArrayList();
       // System.out.println(deque);
        while(deque.size() >= 3) {
            set = new HashSet();
            for (int i = 0; i < m; i++) {
               // System.out.print(((LinkedList) deque).get(i) + " ");
                set.add(((LinkedList) deque).get(i));
            }
            list.add(set.size());
            set = null;
            deque.pollFirst();
           // System.out.println();
        }
        System.out.println(Collections.max(list));

    }
}