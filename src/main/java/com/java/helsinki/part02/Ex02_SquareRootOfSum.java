package com.java.helsinki.part02;

import java.util.Scanner;

public class Ex02_SquareRootOfSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.valueOf(scanner.nextLine());
        int number2 = Integer.valueOf(scanner.nextLine());

        double squareRoot = Math.sqrt(number1 + number2);
        System.out.println(squareRoot);
    }
}
