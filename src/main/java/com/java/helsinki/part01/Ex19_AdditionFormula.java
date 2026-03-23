package com.java.helsinki.part01;

import java.util.Scanner;

public class Ex19_AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give the first number:");
        int number1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int number2 = Integer.valueOf(scanner.nextLine());

        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
    }
}
