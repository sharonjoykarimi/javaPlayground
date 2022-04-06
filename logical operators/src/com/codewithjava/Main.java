package com.codewithjava;

public class Main {

    public static void main(String[] args) {
     // temperature reading true or false if 25 is warm or not if it is 12 it will print false
        int temperature= 25;
        boolean isWarm=temperature>20 && temperature< 30;
        System.out.println(isWarm);

        // this is e.g. for processing loans
        // if you have written false  on hasCriminalRecords it will accept
        boolean hasHighIncome=true;
        boolean hasGoodCredit=true;
        boolean hasCriminalRecords=false;
        boolean isEligible=hasHighIncome || hasGoodCredit && !hasCriminalRecords;

    }
}
