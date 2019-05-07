package com.java.feature.javafeature.hakerrank;

import java.util.*;

public class ArrayLeftRotation {
    //private static final Scanner scanner = new Scanner(System.in);

    // Complete the rotLeft function below.
/*    static int[] rotLeft(int[] a, int d) {
        int startIndex = 0;
        for(int i = startIndex; i< d;){
            int temp =a[0];
            for(int k =0; k < a.length-1; k++){
                a[k] = a[k+1];
            }
            a[a.length-1] = temp;
            i++;
        }
     return a;

    }*/
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int ele: ar){
           if(map.containsKey(ele)){
               map.put(ele, map.get(ele)+1);
           }else{
               map.put(ele, 1);
           }
        }
        return map.entrySet().stream().mapToInt( k-> k.getValue() / 2 ).sum();
    }
    static int sockMerchantSet(int n, int[] ar) {
        Set<Integer> set = new HashSet<>();
        int pair = 0;
        for(int ele: ar){
           if(!set.contains(ele)){
               set.add(ele);
           }else{
               set.remove(ele);
               pair++;
           }
        }
        return pair;//map.entrySet().stream().mapToInt( k-> k.getValue() / 2 ).sum();
    }

    public static void main(String args[]){
        List list = new List() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public Object[] toArray(Object[] a) {
                return new Object[0];
            }

            @Override
            public boolean add(Object o) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection c) {
                return false;
            }

            @Override
            public boolean addAll(Collection c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Object get(int index) {
                return null;
            }

            @Override
            public Object set(int index, Object element) {
                return null;
            }

            @Override
            public void add(int index, Object element) {

            }

            @Override
            public Object remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator listIterator() {
                return null;
            }

            @Override
            public ListIterator listIterator(int index) {
                return null;
            }

            @Override
            public List subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        int socks[] = new int[]{2,4};//{10,20,20,10,10,30,50,10,20,50};
        int num = sockMerchantSet(9, socks);
        System.out.println(num);
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

      //  String[] nd = scanner.nextLine().split(" ");

        /*int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
*/
        /*for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }*/
/*        int a[] = new int[]{1,2,3,4,5};
        System.out.print("array ");
        for(int ele: a){
            System.out.print(ele+" ");
        }
        System.out.println();
        int[] result = rotLeft(a,4 );
        for(int ele: result){
            System.out.print(ele+" ");
        }*/

       /* for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
*/
      //  scanner.close();
    }
}
