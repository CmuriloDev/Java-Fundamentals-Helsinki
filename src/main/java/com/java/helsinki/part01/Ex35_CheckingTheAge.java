package com.java.helsinki.part01;

import java.util.Scanner;

public class Ex35_CheckingTheAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = Integer.valueOf(scan.nextLine());

        if (age < 0 || age > 120) {
            System.out.println("Impossible!");
        } else {
            System.out.println("OK");
        }
    }
}
