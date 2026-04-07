package com.java.helsinki.part02;

import java.util.Scanner;

public class Ex13_AverageOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int attempts = 0;
        int sum = 0;

        while(true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            } else if (number < 0) {
                continue;
            } else {
                attempts = attempts + 1;
                sum = sum + number;
            }
        }
        if (attempts == 0) {
            System.out.println("Cannot calculate the average");
        }
        double average = (double) sum / attempts;
        System.out.println(average);
    }
}
