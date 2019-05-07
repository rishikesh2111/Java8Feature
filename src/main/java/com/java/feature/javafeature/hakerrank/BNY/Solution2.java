package com.java.feature.javafeature.hakerrank.BNY;
import java.io.*;
import java.util.*;


class Result {

    /*
     * Complete the 'playlist' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING_ARRAY songs
     *  2. INTEGER k
     *  3. STRING q
     */

    public static int playlist(List<String> songs, int k, String q) {
        // Write your code here
      //  songs.get(k);

        int count = songs.indexOf(q);
        int last = songs.size() - count;
        int start = songs.size() - k;
        int num = last+start;
        int dist = songs.indexOf(q) - k;
        if(num == dist){
            return num;
        }
        return 0;
    }

}

public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int songsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> songs = new ArrayList<>();

        for (int i = 0; i < songsCount; i++) {
            String songsItem = bufferedReader.readLine();
            songs.add(songsItem);
        }

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String q = bufferedReader.readLine();

        int result = Result.playlist(songs, k, q);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
