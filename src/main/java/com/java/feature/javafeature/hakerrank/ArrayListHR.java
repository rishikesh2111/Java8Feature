package com.java.feature.javafeature.hakerrank;
import java.io.*;
import java.util.*;

public class ArrayListHR {

    public static void main(String[] args)throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int noOfInput = Integer.parseInt(br.readLine());
        List<List<Integer>> lists = new ArrayList<>();
        for(int i = 0; i< noOfInput; i++){
            String ele = br.readLine();
            String no[] = ele.split(" ");
            int count = Integer.parseInt(no[0]);
            List list = new ArrayList();
            for(int j = 1; j <= count; j++){
                list.add(Integer.parseInt(no[j]));
            }
            lists.add(list);
            list = null;

        }
        int noOfQueries = Integer.parseInt(br.readLine());
        for(int k = 0; k< noOfQueries; k++) {
            String query[] = br.readLine().split(" ");
            int lstIndex = Integer.parseInt(query[0]);
            List list = null;
            if (lists.size()>= lstIndex){
                list = lists.get(lstIndex - 1);
                int valIndex = Integer.parseInt(query[1]);
                if(list.size() >= valIndex) {
                    int val = (Integer) list.get(valIndex - 1);
                    System.out.println(val);
                }else{
                    System.out.println("ERROR!");
                }
           }else{
                System.out.println("ERROR!");
            }

        }
      //  System.out.println(lists);
    }
}

