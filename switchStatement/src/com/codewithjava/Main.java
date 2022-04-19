package com.codewithjava;

public class Main {

    public static void main(String[] args) {
        switch (role) {
            case "admin":
                System.out.println("you are an admin");
                break;
            case "moderator":
                System.out.println("you are a moderator");
                break;
            default:
                System.out.println("you ar e a guest");

        }

        String role="admin";
        if (role=="admin")
            System.out.println("you are an admin");
        else if(role=="moderator");
        System.out.println("you are a moderator");

        System.out.println("you are a guest");

      }
}
