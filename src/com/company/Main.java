package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String password = "A1234";

        Scanner scan = new Scanner (System.in);
        System.out.println("Type your password");
        String password_new = scan.next();

        scan.close();
        if (password.equals(password_new))
            System.out.println("Password is valid");
        else System.out.println("Invaid Password");


        }






    }


