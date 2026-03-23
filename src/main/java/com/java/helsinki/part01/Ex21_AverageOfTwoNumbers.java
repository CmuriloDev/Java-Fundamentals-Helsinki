package com.java.helsinki.part01;

import java.util.Scanner;

public class Ex21_AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int number1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int number2 = Integer.valueOf(scanner.nextLine());

        double result = 1.0 *(number1+number2)/2;

        System.out.println("The average is " + result);
    }
}

