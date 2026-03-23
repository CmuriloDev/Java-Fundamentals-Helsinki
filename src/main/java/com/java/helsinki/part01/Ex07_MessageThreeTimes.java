package com.java.helsinki.part01;

import java.util.Scanner;

public class Ex07_MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        // Write your program here
        String repeat = scanner.nextLine();

        System.out.println(repeat);
        System.out.println(repeat);
        System.out.println(repeat);
    }
}
