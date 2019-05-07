package com.java.feature.javafeature.hakerrank;
import java.util.*;
public class IteratorHR{

    static int divisor_sum(int v){
        int sum = 0;
            for(int i =1; i <= v;) {
                if (v % i == 0) {
                    sum = sum + i;
                }
                i++;
            }
        return sum;
    }

    static Iterator func(ArrayList mylist){
        System.out.println(mylist);
        Iterator it=mylist.iterator();
        while(it.hasNext()){
            Object element = it.next();
            if((element instanceof String)) {
              //  System.out.println("ele "+element);
             //   it.remove();
                break;
            }
        }
        return it;

    }
    @SuppressWarnings({ "unchecked" })
    public static void main(String []args){
        System.out.println(divisor_sum(6));
       /* ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 0;i<n;i++){
            mylist.add(sc.nextInt());
        }*/

       /* mylist.add("###");
        for(int i=0;i<m;i++){
            mylist.add(sc.next());
        }

        Iterator it=func(mylist);
        while(it.hasNext()){
            Object element = it.next();
            System.out.println((String)element);
        }*/
    }
}
