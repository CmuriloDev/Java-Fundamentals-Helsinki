package com.java.helsinki.part01;

import java.util.Scanner;

public class Ex26_Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a number:");
        int number = Integer.valueOf(scan.nextLine());

        if (number == 1984) {
            System.out.println("Orwell");
        }
    }
}
