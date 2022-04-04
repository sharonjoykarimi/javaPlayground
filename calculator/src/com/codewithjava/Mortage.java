
package com.codewithjava;

import java.util.Scanner;

public class Mortage {

    public static void main(String[] args) {
        // print your age
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age:  ");
        byte age = scanner.nextByte();
        System.out.println("you are " + age);

        // prints your name
        Scanner scanners = new Scanner(System.in);
        System.out.print("name:  ");
        String name = scanners.next();
        System.out.println("you name is  " + name);


    }
}
