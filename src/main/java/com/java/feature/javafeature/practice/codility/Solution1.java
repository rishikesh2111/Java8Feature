package com.java.feature.javafeature.practice.codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution1 {

    public static void main(String[] args){
      System.out.println(solution(0,9,9,1,1,1));
     //   solution(0,4,5,6,7,8);
        //solution(1,4,5,6,7,8);
        //solution(2,4,5,9,5,9);
    }
    public static String solution(int A, int B, int C, int D, int E, int F) {
        // write your code in Java SE 8
        List<Integer> number = Arrays.asList(A, B, C ,D, E ,F);
          if(!(number.contains(0)) && !(number.contains(1))){
              return "NOT POSSIBLE";
          }
          Collections.sort(number);
          String hh, mm, ss, time;
          hh = number.get(0)+""+number.get(1);
          mm = number.get(2)+""+number.get(3);
          ss = number.get(4)+""+number.get(5);
          if(Integer.valueOf(mm) > 59 && Integer.valueOf(ss) > 59){
              return "NOT POSSIBLE";
          }
          if(number.get(2) == 0){
              hh = number.get(0)+""+number.get(3);
              mm = number.get(1)+""+number.get(4);
              ss = number.get(2)+""+number.get(5);
          }
          if(Integer.valueOf(mm) > 59){

          }else if(Integer.valueOf(ss) > 59){
              mm = number.get(2)+""+number.get(4);
              ss = number.get(3)+""+number.get(5);
          }
          time = hh+":"+mm+":"+ss;
          System.out.println(time);
        return time;
    }
}
