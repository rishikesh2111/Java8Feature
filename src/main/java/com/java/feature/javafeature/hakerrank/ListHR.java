package com.java.feature.javafeature.hakerrank;
import java.io.*;
import java.util.*;

public class ListHR {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String ele[] = (br.readLine()).split(" ");
        List<Integer> list = new ArrayList<>();

        for(String s:ele){
            list.add(Integer.parseInt(s));
        }
        int query = Integer.parseInt(br.readLine());
        for(int i = 0; i< query; i++){
            String queryString = br.readLine();
            if(queryString.equalsIgnoreCase("Insert")){
               String e[] = br.readLine().split(" ");
               int index = Integer.parseInt(e[0]);
               int object = Integer.parseInt(e[1]);
               list.add(index, object);
            }else if(queryString.equalsIgnoreCase("Delete")){
                int object = Integer.parseInt(br.readLine());
                list.remove(object);
            }
        }
        for(int e:list)
        System.out.print(e+" ");
    }
}
