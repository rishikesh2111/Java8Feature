package com.java.feature.JavaFeature.practice;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class TagExtractor {

    public static void main(String[] args)throws Exception{
        //Stream<String> lines =  Files.lines(Paths.get("C:\\Rishi\\RnD\\GitHub-Repo\\Java8Feature\\src\\main\\java\\com\\java\\feature\\JavaFeature\\practice\\test.txt"));
        //lines.forEach(System.out::println);
       // lines.map(line -> line.startsWith("<"));
/*        String str = "java";
        StringBuffer sb = new StringBuffer();
        char[] arr =  str.toCharArray();
        int start = arr.length;
        for(int i = start-1; i >= 0 ; i--){
            System.out.println(arr[i]);
            sb.append(arr[i]);
        }
        String rev = sb.toString();
        System.out.println(str.contentEquals(rev));
        if(str.contentEquals(rev)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }*/
//System.out.println(isAnagram("act","tka"));

        Runnable r =() -> {

            for(int i = 1; i <= 6; i++){
                System.out.println("i "+i);
            }
        };

        Thread t = new Thread(r);
        t.start();


    }

    public static boolean isAnagram(String anagram, String anagramr){
        char [] ch =  anagram.toCharArray();
        char [] chr = anagramr.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(chr);
        return Arrays.equals(ch, chr);
    }

}
