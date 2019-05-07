package com.java.feature.javafeature.practice.codility;

import java.util.Arrays;

public class Solution2 {
    public static void main(String[] args){

        int A[] = {2,1,5};
        int B[] = {3,3,4,5};
        System.out.println(solution(A, B));

    }
    static int solution(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;;
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
        int len = n>m?m:n;
        for (int k = 0; k < len; k++) {
            if (i < m - 1 && B[i] < A[k])
                i += 1;
            if (A[k] == B[i])
                return A[k];
        }
        return -1;
    }
}
