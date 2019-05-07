package com.java.feature.javafeature.hakerrank;

import java.util.Scanner;

public class ArrayGameHR {

    public static void main(String[] args){


        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }


            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();    }

    private static boolean canWin(int leap, int[] game) {
        int i =0;
        int jump = i+ leap;
        //leap+index greater than game array start
        if(jump >= game.length){
            return true;
        }
        //leap+index greater than game array end
        boolean flag =false;

        //when all element is 0 start
        for(int val: game){
            if(val == 1){
                flag = true;
                break;
            }
        }
        if(!flag){
            return true;
        }
        //when all element is 0 end
        //leap +index and index both equals 1 start
        if(game[i]!= 0 && game[jump] != 0){
            return false;
        }
        //leap +index and index both equals 1 end
        int newIndex = i+1;
        if(game[newIndex] == 0){
            int newJump = newIndex+leap;
            if(newJump == game.length){
                return true;
            }
        }
        return false;
    }
}
