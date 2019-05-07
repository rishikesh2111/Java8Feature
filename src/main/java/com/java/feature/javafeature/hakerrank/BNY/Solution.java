package com.java.feature.javafeature.hakerrank.BNY;
import java.io.*;
import java.util.*;

class Result1 {

    /*
     * Complete the 'countMax' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts STRING_ARRAY upRight as parameter.
     */

    public static long countMax(List<String> upRight) {
        // Write your code here
         int arr[][] = new int [100][100];
        for(int i = 0; i< upRight.size(); i++){
            String a[] = upRight.get(i).split(" ");
            int left = Integer.valueOf(a[0]);
            int right = Integer.valueOf(a[1]);
            for(int j = 0; j < left; j++){
                for(int k = 0; k < left; k++){
                    if(i == 1) {
                        arr[j][k] = i + 1;
                    }
                    if(i == 2) {
                        arr[j][k] = i + 1;
                    }
                    if(i == 3) {
                        arr[j][k] = i + 1;
                    }
                    if(i == 4) {
                        arr[j][k] = i + 1;
                    }
                }
            }
        }
        for(int i =0; i< 10; i++){
            for(int j = 0;j < 10; j++){
                System.out.print(arr[i][j]+" ");
            }
        }
        return 0;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int upRightCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> upRight = new ArrayList<>();

        for (int i = 0; i < upRightCount; i++) {
            String upRightItem = bufferedReader.readLine();
            upRight.add(upRightItem);
        }
        long result = Result1.countMax(upRight);

      //  bufferedWriter.write(String.valueOf(result));
       // bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}

