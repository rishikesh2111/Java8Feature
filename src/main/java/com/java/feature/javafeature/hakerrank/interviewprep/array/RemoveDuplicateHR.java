package com.java.feature.javafeature.hakerrank.interviewprep.array;

public class RemoveDuplicateHR {

    public static void removeDuplicate(int[] arr, int n){
        if(n == 0 || n == 1){
            System.out.println(n);
        }
        int newArray[] = new int[n];
        int j = 0;
        for(int i = 0; i< n -1; i++){
            if(arr[i] != arr[i+1]) {
                newArray[j++] = arr[i];
            }
        }
        newArray[j++] = arr[n-1];

        int arr1[] = new int[j];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = newArray[i];
        }
       /* for (int i=0; i<j; i++){
            arr[i] = newArray[i];
        }*/
        for(int ele: arr1){
            System.out.print(ele+" ");
        }

    }
    public static void main(String[] args){
        int[] arr = new int[]{3,4,5,8,1,2,6,6,5,3,8,9};
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j< arr.length; j++){
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        removeDuplicate(arr, arr.length);
/*        for(int i = 0; i < arr.length; i++){
            for(int j = i; j< arr.length; j++){
               if(arr[i] > arr[j]) {
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }
            }
        }
        for(int i = 0; i< arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                System.out.print(arr[i]+"  ");
                System.out.println("Duplicate");
                int index = i+1;
                for(int j = index; j<arr.length-1;){
                      arr[j] = arr[j+1];
                      j++;
                }
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }*/

    }
}
