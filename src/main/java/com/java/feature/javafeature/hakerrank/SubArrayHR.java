package com.java.feature.javafeature.hakerrank;
import java.io.*;

public class SubArrayHR {

    public static void main(String[] args)throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       // Scanner scan = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        String strArr[] = reader.readLine().split(" ");
        int arr[] = new int[count];
        int index = 0;
        for(String ele:strArr){
            arr[index] = Integer.parseInt(ele);
            index++;
        }
       int sum1 =0, sum2 = 0;
       for(int i =0; i< arr.length; i++){
           if(arr[i] < 0){
               sum1+=1;
           }

           for(int j = i+1; j < arr.length; j++){
           int sum = 0;
           for(int k = i; k <=j;k++){
                      sum +=arr[k];
                       }
               if(sum < 0){
                   sum2+=1;
               }
           }
       }
        System.out.println(sum1+sum2);
     }
}

