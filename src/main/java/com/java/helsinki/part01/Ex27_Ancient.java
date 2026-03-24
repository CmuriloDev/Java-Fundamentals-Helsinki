package com.java.helsinki.part01;

import java.util.Scanner;

public class Ex27_Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a year:");
        int year = Integer.valueOf(scan.nextLine());

        if (year < 2015) {
            System.out.println("Ancient history!");
        }
    }
}
