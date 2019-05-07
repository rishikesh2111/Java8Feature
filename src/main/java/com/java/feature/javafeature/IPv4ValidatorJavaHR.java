package com.java.feature.javafeature;

public class IPv4ValidatorJavaHR {

    public static void main(String[] args){
        String IP3 = "8.000.00.300";
        System.out.println(IP3.matches(new MyRegex().pattern));
        String IP4 = "111.111.11.111";
        System.out.println(IP4.matches(new MyRegex().pattern));

    }


}
class MyRegex{
    //String pattern = "\\d{1,3}.\\d{1,3}.\\d{1,3}.\\d{1,3}";
    public String zeroTo255 = "([0-9]|[0-9][0-9]|[0-2][0-4][0-9]|25[0-5])";
    public String zeroTo255DigitClass = "(\\d|\\d\\d|[0-2][0-4]\\d|25[0-5])";
    public String pattern = "^(" +zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 +")$";

}
/*
12.12.12.12
13.13.13.112
VUUT.12.12
111.111.11.111
1.1.1.1.1.1.1
.....
1...1..1..1
0.0.0.0
255.0.255.0
266.266.266.266
00000.000000.0000000.00001
0023.0012.0012.0034
true
true
false
true
false
false
false
true
true
false
false
false
 */