package com.java.helsinki.part01;

import java.util.Scanner;

public class Ex29_Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("How old are you?");
        int age = Integer.valueOf(scan.nextLine());

        if (age < 18) {
            System.out.println("You are not an adult");
        } else {
            System.out.println("You are an adult");
        }
    }
}
