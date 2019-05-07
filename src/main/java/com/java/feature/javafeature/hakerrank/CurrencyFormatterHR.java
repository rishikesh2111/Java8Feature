package com.java.feature.javafeature.hakerrank;
import java.util.*;
import java.text.*;

public class CurrencyFormatterHR {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        NumberFormat numberFormatUs = NumberFormat.getCurrencyInstance(Locale.US);
        String us = numberFormatUs.format(payment);
        NumberFormat numberFormatIn = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat numberFormatCh = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat numberFormatFr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String india = numberFormatIn.format(payment);
        String china = numberFormatCh.format(payment);
        String france = numberFormatFr.format(payment);

        // Write your code here.

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
