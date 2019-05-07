package com.java.feature.javafeature.hakerrank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SortingCheck {

    public static void main(String[] args){
        Set set = new HashSet();
      //  String pair_left[] = {"rishi","kumar", "kumar"};
        String [] pair_left = {"rishi","kumar", "kumar"};;
        String [] pair_right = {"nidhi","sharma", "sharma"};

        for(int i = 0; i< pair_left.length;){
            set.add(pair_left[i]);
            set.add(pair_right[i]);
            if(set.size() == 2){
                System.out.println(1);
            }else{
                System.out.println(set.size() - 1);
            }
        }

        for(String s: pair_left){
            set.add(s);
        }
        for(String s: pair_right){
            set.add(s);
        }
        int [] arr = {0, 1, -1,0,-1,0,1};

        for(int i = 0; i< arr.length;){
            for(int j=0; j< arr.length;) {
                if (arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j] = temp;
                }
                j++;
            }
            i++;
        }
System.out.println(Arrays.toString(arr));
    }
}
