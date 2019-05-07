package com.java.feature.javafeature.hakerrank;
import java.util.*;

public class ArrayChaoticNewYear {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] arr) {
        boolean chaotic = false;
        int l = arr.length, bribes = 0;
        int temp[] = new int[l];
        for(int i = 0; i< l; i++){
            temp[i] = arr[i];
        }
        Arrays.sort(arr);

        for(int j = l-1; j > 1; j--){
            if(temp[j] == arr[j]){
            //  break;
            }
            if(temp[j-1] == arr[j]){
                bribes++;
              //  break;
            }else if(temp[j-2] == arr[j]){
               bribes+=2;
              //  break;
            }else{
                chaotic = true;
            }
        }
        if(arr[1] == temp[0]){
            bribes++;
        }
        if(chaotic){
            System.out.println("Too chaotic");
        }else{
            System.out.println(bribes);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(temp));

    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
      /*  int t = scanner.nextInt();
       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
          //  scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
          //  scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }*/
            int arr[] = new int[]{5,1,2,3,7,8,6,4};
            int arr1[] = new int[]{1,2,5,3,7,8,6,4};
            minimumBribes(arr);
            minimumBribes(arr1);
    }

       // scanner.close();

}


