package com.java.feature.javafeature.hakerrank.GoldManSach;
import java.io.*;

import static java.util.stream.Collectors.joining;


class Result {

    /*
     * Complete the 'findDamagedToy' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER N
     *  2. INTEGER T
     *  3. INTEGER D
     */

    public static int findDamagedToy(int N, int T, int D) {
         int result = D +T -1 ;
         if(result > N){
             result = result - N;
         }
        return result;
    }

}

public class SolutionGSHR {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        int T = Integer.parseInt(bufferedReader.readLine().trim());

        int D = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.findDamagedToy(N, T, D);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}