package com.codewithjava;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Principal: ");
        int Principal = scanner.nextInt();

        System.out.println("Annual Interest Rate: ");
        float AnnualInterest = scanner.nextFloat();
        float monthlyInterest = AnnualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.println("period(years); ");
        byte years = scanner.nextByte();
        int numberOfPayment = years * MONTHS_IN_YEAR;

        double mortgage = Principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayment));


        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);


    }
}