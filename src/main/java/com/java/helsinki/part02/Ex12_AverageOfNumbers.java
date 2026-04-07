package com.java.helsinki.part02;

import java.util.Scanner;

public class Ex12_AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int attempts = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            } else {
                sum = sum + number;
                attempts = attempts + 1;
            }
        }
        double average = (double) sum / attempts;
        System.out.println("Average of the numbers: " + average);
    }
}
