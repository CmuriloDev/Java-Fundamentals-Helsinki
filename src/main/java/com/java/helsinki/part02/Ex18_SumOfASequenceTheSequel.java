package com.java.helsinki.part02;

import java.util.Scanner;

public class Ex18_SumOfASequenceTheSequel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number?");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.print("Last number?");
        int number2 = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = number; i <= number2; i++) {
            sum = i + sum;
        }
        System.out.println("The sum is " + sum);
    }
}
