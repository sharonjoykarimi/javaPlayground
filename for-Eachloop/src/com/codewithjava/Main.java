package com.codewithjava;

public class Main {

    public static void main(String[] args) {

        String[] fruits = {"Apple", "Matomoko", "Mango", "Berries", "grapes", "peaches"};
        // This is the long method of naming the fruits
        for (int i = 0; i < fruits.length; i++)
            System.out.println(fruits[i]);
        // instead of doing all that you can just do this method for each loop with just  naming the strings name
        for (String fruit : fruits) ;
          System.out.println(fruits);
    }
    }

