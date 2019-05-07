package com.java.feature.javafeature.hakerrank;
import java.util.*;
class StackHR{


    public static void main(String []argh)
    {

        String input = "(({()})))";


        System.out.println(checkExpression(input));
        //Scanner sc = new Scanner(System.in);


/*        while (sc.hasNext()) {
            String input=sc.next();
            System.out.println(input);
            char paren[] = input.toCharArray();
            char parenOpCl[][] = {{'(',')'},{'{','}'},{'[',']'}};
            Map<Character, Integer> openParen = new TreeMap<>();
            Map<Character, Integer> closeParen = new TreeMap<>();
            for(char ch: paren){
                if(ch == '(' || ch == '{' || ch == '['){
                    if(openParen.containsKey(ch)){
                        openParen.put(ch, openParen.get(ch)+1);
                    }else {
                        openParen.put(ch, 1);
                    }
                }else if(ch == ')' || ch == '}' || ch == ']'){
                    if(closeParen.containsKey(ch)){
                        closeParen.put(ch, closeParen.get(ch)+1);
                    }else {
                        closeParen.put(ch, 1);
                    }                }
            }
            boolean flag = true;
             for(char[] ch:parenOpCl){
                 System.out.println(ch[0]+"  "+ch[1]);
                 if(openParen.get(ch[0]) != closeParen.get(ch[1])){
                     flag = false;
                     break;
                 }
             }
             System.out.println(flag);
          }*/

    }
    private static boolean checkExpression(String input){
        Stack<Character> st = new Stack<>();
        for(char c:input.toCharArray()){
            switch (c){
                case '(':
                case '{':
                case '[':
                    st.push(c);
                    break;
                case '}':
                    if (st.empty() || (st.peek() != '{')) {
                        // return "NO";
                        return false;
                    }
                    st.pop();
                    break;
                case ')':
                    if (st.empty() || (st.peek() != '(')) {
                        // return "NO";
                        return false;
                    }
                    st.pop();
                    break;
                case ']':
                    if (st.empty() || (st.peek() != '[')) {
                        // return "NO";
                        return false;
                    }
                    st.pop();
                    break;
            }
        }
        return st.empty() ?true :false;
    }
}