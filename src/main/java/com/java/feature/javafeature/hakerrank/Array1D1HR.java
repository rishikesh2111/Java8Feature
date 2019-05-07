package com.java.feature.javafeature.hakerrank;
import java.util.*;

public class Array1D1HR {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for(int i =0; i< a.length;i++){
            a[i] = scan.nextInt();
        }
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
class Add{
    void add(int... args){
        int sum = 0;
        for(int i =0;i< args.length; i++){
            sum = sum + args[0];
            System.out.print(args[i]+" ");
        }
        System.out.println("="+sum);
    }
}
class MyCalculator {
    /*
     * Create the method long power(int, int) here.
     */
    double power(int n, int p){
        Double result = 0D;
     try{
         if(n == 0 && p == 0){
             throw new Exception("n and p should not be zero.");
         }else if(n < 0 || p< 0){
             throw new Exception("n and p should not be negative.");
         }else{
             result = Math.pow(n,p);
         }
     }catch (Exception ex){
       System.out.println("java.lang.Exception: "+ex.getMessage());
     }
     int r =  result.intValue();

     return r;
    }

}