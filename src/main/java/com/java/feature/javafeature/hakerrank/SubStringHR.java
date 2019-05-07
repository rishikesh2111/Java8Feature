package com.java.feature.javafeature.hakerrank;
import java.util.Scanner;

public class SubStringHR {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        int arrLength = s.length() - k+1;
        String str[] = new String[arrLength];
        for(int i = 0; i<= s.length()-k; i++){
            str[i] = s.substring(i,k+i);;
        }
        String temp = "";
        for (int i = 0; i < str.length; i++)
        {
            for (int j = i + 1; j < str.length; j++)
            {
                if (str[i].compareTo(str[j])>0)
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        smallest = str[0];
        largest = str[str.length - 1];
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
