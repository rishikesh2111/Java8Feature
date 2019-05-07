package com.java.feature.javafeature;

public class StringReverse {

    public String reverseString(String str) {
        char ch[] = str.toCharArray();
        StringBuilder builder = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--){
            builder.append(ch[i]);
        }
      return builder.toString();
    }
}
