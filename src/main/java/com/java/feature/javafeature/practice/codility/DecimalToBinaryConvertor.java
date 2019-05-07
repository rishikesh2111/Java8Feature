package com.java.feature.javafeature.practice.codility;

public class DecimalToBinaryConvertor {
    public static void main(String... args){
        convertBinaryToDecimal(124);
        int t = 0b011;
    }
    private static void convertBinaryToDecimal(int n){

        boolean flag = true;
        StringBuilder builder = new StringBuilder();
        while(flag){
            int i = n % 2;
            builder.append(i);
            n = n /2;
            if(n == 0 || n == 1){
                builder.append(n);
                flag = false;
            }
        }
        System.out.println(builder.reverse().toString());
    }
}
