package com.java.helsinki.part02;

import java.util.Scanner;

public class Ex11_NumberAndSumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int attempts = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());

            if (number == 0) {
                break;
            } else {
                sum = sum + number;
                attempts = attempts + 1;
            }
        }
        System.out.println("Number of numbers: " + attempts);
        System.out.println("Sum of the numbers: " + sum);
    }
}
