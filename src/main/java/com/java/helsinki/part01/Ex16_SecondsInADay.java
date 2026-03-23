package com.java.helsinki.part01;

import java.util.Scanner;

public class Ex16_SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("How many days would you like to convert to seconds?");
        int days = Integer.valueOf(scanner.nextLine());

        System.out.println(days * 86400);
    }
}
