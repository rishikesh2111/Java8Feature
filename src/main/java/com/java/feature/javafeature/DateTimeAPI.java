package com.java.feature.javafeature;

public class DateTimeAPI {
    public static class DecimalToBinaryConverTer {

        public static void main(String... args){
            System.out.println("args");
            convertDecimalToBinary(180);
        }

        public static String convertDecimalToBinary(int number){
            boolean flag =true;
            StringBuilder builder =new StringBuilder();
            while(flag){
                int n = number % 2;
                builder.append(n);
                number = number / 2;
                if(number == 0 || number == 1){
                    flag = false;
                }
            }
            int count = 0;
            char ch[] = builder.toString().toCharArray();
            for(char c:ch){
                if(c == '1')count++;
                System.out.println("c "+c);
            }
            System.out.println("count "+count);
            System.out.println(builder.toString());
            return builder.toString();
        }

        private static int countOne(char c1, char c2){
            System.out.println("c1 "+c1+"  c2 "+c2);
            return 1;
        }
    }
}
