package com.java.helsinki.part02;

import java.util.Scanner;

public class Ex03_AbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.valueOf(scanner.nextLine());

        if (number < 0) {
            int positive = number * -1;
            System.out.println(positive);
        } else {
            System.out.println(number);
        }
    }
}
