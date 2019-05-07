package com.java.feature.javafeature.hakerrank.interviewprep.array;

public class SubArrayHR {

    public static void main(String[] args){
        int [] arr= {1,-2,3};
        int count = 0;
        for(int i =0; i< arr.length; i++) {
            int sum =0;
            for (int j = i; j < arr.length; j++) {
                sum+=arr[j];
            if (arr[i] > 0) {
                count++;
            }
        }
        }
        System.out.println();
    }
}
/*
[1,2,3]
1,2,3, 1 2, 1 3, 2 3, 1 2 3

 */
