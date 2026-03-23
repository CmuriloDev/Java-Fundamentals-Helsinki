package com.java.helsinki.part01;

import java.util.Scanner;

public class Ex22_AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int number1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int number2 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the third number:");
        int number3 = Integer.valueOf(scanner.nextLine());

        double result = 1.0 *(number1+number2+number3)/3;

        System.out.println("The average is " + result);
    }
}
