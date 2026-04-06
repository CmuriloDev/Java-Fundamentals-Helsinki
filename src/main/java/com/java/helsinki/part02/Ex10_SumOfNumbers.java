package com.java.helsinki.part02;

import java.util.Scanner;

public class Ex10_SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());

            if (number == 0) {
                break;
            }

            sum = sum + number;
        }

        System.out.println("Sum of the numbers: " + sum);
    }
}
