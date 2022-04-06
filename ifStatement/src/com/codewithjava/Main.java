package com.codewithjava;

public class Main {

    public static void main(String[] args) {
     int temp=32;
     if (temp>30){
         System.out.println("it a Hot day");
         System.out.println("drink a cold drink");
     }
     else if (temp>20)
         System.out.println("it si a beautiful day");
     else
         System.out.println("it is freezing cold");


     //Simplifying If Statements
        int income= 120_000;
        boolean hasHighIncome=(income>100_000);
        System.out.println(hasHighIncome);

    }
}
