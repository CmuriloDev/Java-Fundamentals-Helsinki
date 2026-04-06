package com.java.helsinki.part02;

import java.util.Scanner;

public class Ex08_NumberOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int attempts = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            } else {
                attempts = attempts + 1;
            }
        }
        System.out.println("Number of numbers: " + attempts);
    }
}
