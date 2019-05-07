package com.java.feature.javafeature.hakerrank;

import java.io.*;
import java.time.LocalDate;
import java.util.*;
import java.util.regex.*;

public class Solution {




    static int camelcase(String s) {

        Pattern p = Pattern.compile("[A-Z]");
        int count = 1;

        char [] arr = s.toCharArray();
        for(int i = 0; i< arr.length; i++){
           if(p.matcher(String.valueOf(arr[i])).matches()){
               count++;
           }
        }
        return count;

    }
    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
    // rishi, rishikumar

        char [] arr1 = s1.toCharArray();
        char [] arr2 = s2.toCharArray();
        for(int i =0; i< arr1.length-1; i++){
            for(int j =0; j< arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    return "YES";
                }
            }
        }

       return "NO";
    }
    static String superReducedString(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i = 1; i < sb.length(); i++){
            if(sb.charAt(i) == sb.charAt(i - 1)){
                sb.delete(i-1, i+1);
                i = 0;
            }
        }
        if(sb.length() == 0){
            sb.append("Empty String");
        }
      return sb.toString();
        }


    private static final Scanner scanner = new Scanner(System.in);

    static int simpleArraySum(int[] ar) {

        return Arrays.stream(ar).sum();

    }
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
          int scoreAlice = 0, scoreBob =0, score=0;

          for(int i = 0; i< a.size(); i++){
              int ele1 = a.get(i);
              int ele2 = b.get(i);
              score =  (ele1 > ele2)?scoreAlice++:(ele1 < ele2)?scoreBob++:0;
          }

        return Arrays.asList(scoreAlice, scoreBob);

    }
    static long aVeryBigSum(long[] ar) {

        return Arrays.stream(ar).reduce(0L, (e1, e2) -> e1 + e2);
    }

    public static boolean isPrime(int num){
        for(int i =3; i< num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void isPalindrome(int n){
        int temp = n, a = 0;
        while(n > 0){
             int num = n % 10;
             a = a * 10 + num;
             n  = n /10;
        }
        System.out.println(" a "+a+ " n "+temp);
        if(a == temp ){
            System.out.println("Palindrom "+" a "+a+ " n "+temp);
        }
    }

    public static void printseries(){
        int t = 1, a = 5 ,b = 3, n = 5,val = 0;
        for(int i=0;i<t;i++){

            for(int j = 0; j< n;){
                Double value = Math.pow(2,j);
                val += (value.intValue()* b);
                System.out.print((a+val)+" ");
                j++;
            }
            System.out.print("\n");


        }
    }
    public static String findDay() {
        int month = 8, day = 5, year = 2015;
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().toString();
    }

    class MyRegex{
        Pattern pattern = Pattern.compile("\\d{3}.\\d{3}.\\d{3}");
    }
    abstract class Flower {
        public abstract String whatsYourName();
    }

    class Jasmine extends Flower{
        public String whatsYourName(){
            return "Jasmine";
        }
    }

    class Lily extends Flower{
        public String whatsYourName(){
            return "Lily";
        }
    }
    abstract class Region {
        public abstract Flower yourNationalFlower();

    }

    class WestBengal extends Region {
        public Flower yourNationalFlower(){
            return new Jasmine();
        }
    }

    class AndhraPradesh extends Region {
        public Flower yourNationalFlower(){
            return new Lily();
        }
    }
    static boolean isAnagram(String a, String b) {
        // Complete the function

        char ch1[] = a.toLowerCase().toCharArray();
        char ch2[] = b.toLowerCase().toCharArray();
        java.util.Arrays.sort(ch1);
        java.util.Arrays.sort(ch2);
        return java.util.Arrays.equals(ch1, ch2)?true:false;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(isAnagram("cat","tac"));
        System.out.println(isAnagram("rishi","kumar"));

        /*String A = "rishi";
        String B = "kumar";
         if(A.compareTo(B) > 1){
             System.out.println("Yes");
         }else{
             System.out.println("No");
         }
         System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));
*/      /*  Map<String, String> map = new HashMap<>();
        String s = String.valueOf(8788);
        map.put("rishi", s);
        if(map.containsKey("rishi")){
            s=map.get("rishi");
            System.out.println(s+"="+map.get("rishi"));
        }else {
            System.out.println("Not found");
        }*/

        /*
        12.12.12.12
13.13.13.112
VUUT.12.12
111.111.11.111
false
false
false
true
true
false
false
false
1.1.1.1.1.1.1
.....
1...1..1..1
0.0.0.0
255.0.255.0
266.266.266.266
00000.000000.0000000.00001
0023.0012.0012.0034
         */
     //   Pattern pattern = Pattern.compile("[0-2]{1}[0-5]{0,2}.[0-2]{1}[0-5]{0,2}.[0-2]{1}[0-5]{0,2}.[0-2]{1}[0-5]{0,2}");
      //  Pattern pattern1 = Pattern.compile("[0-2]{1}[0-5]{2}");
      //  String IP = "0023.0012.0012.0034";
       // System.out.println(IP.matches(pattern.pattern()));
/*        String str = "Helloworld";
        System.out.println(str.substring(3,7));*/
/*        int n = 3;
        Set<String> arrList = new TreeSet<>();
        for(int i = 0; i<= str.length()-n;){
            arrList.add(str.substring(i).substring(0,3));
            i++;
        }
        System.out.println(arrList);
        System.out.println(((TreeSet<String>) arrList).first());
        System.out.println(arrList.get(arrList.size()-1));*/


/*        String pattern = "([A-Z])(.+)\n";
        Pattern pat = Pattern.compile(pattern);
        String pattern1 = "[AZ[a-z](a-z)}";
        String pattern2 ="batcatpat(nat)";
        Pattern pat1 = Pattern.compile(pattern1);
        try {
            Pattern pat2 = Pattern.compile("[AZ[a-z](a-z)");
            System.out.print("Valid");

        }catch(PatternSyntaxException pa){
            System.out.print("Invalid");
        }

        System.out.print(pat.pattern());*/




/*        String s = "Hello, thanks for attempting this problem! Hope it will help you to learn java! Good luck and have a nice day!\n" ;// Write your code here.
        String arr[]  = s.split("[\\s+,'@_?.!]+");
        System.out.println(arr.length);
        List<String> strList = new ArrayList<>();
        for(String st: arr){
            if(!st.trim().equalsIgnoreCase("")) {
                strList.add(st);
            }
        }
        System.out.println(strList.size());
        for(String st: strList){
           System.out.println(st);
        }*/
        }
        // findDay();
       // printseries();
        /*isPalindrome(953);
        isPalindrome(252);
        isPalindrome(898);
        isPalindrome(117);
*/
/*
       2^0
        long [] sumEle = {100000000, 40000000, 500000000, 69837434, 437924297};
        aVeryBigSum(sumEle);
        int T = 0;
*/


/*        List<Integer> a = Arrays.asList(14, 12, 19, 30, 47, 29);
        List<Integer> b = Arrays.asList(19, 23, 45, 10, 16, 45);
        compareTriplets(a, b);*/
       /* BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();
*/
      // int count = camelcase("camelCaseTest");
     //   String str = superReducedString("zztqooauhujtmxnsbzpykwlvpfyqijvdhuhiroodmuxiobyvwwxupqwydkpeebxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh");
      //  System.out.println(str);
           /* System.out.println(twoStrings("hello", "world"));
            System.out.println(twoStrings("hi", "world"));
            System.out.println(twoStrings("nidhi", "sharmi"));
            System.out.println(twoStrings("shivam", "kumarshivaam"));
        System.out.println(twoStrings("hll", "water"));
*/

         /*   bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
   */ }


