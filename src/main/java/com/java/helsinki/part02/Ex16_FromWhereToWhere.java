package com.java.helsinki.part02;

import java.util.Scanner;

public class Ex16_FromWhereToWhere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Where to?");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.print("Where from?");
        int number2 = Integer.parseInt(scanner.nextLine());

        for (int i = number2; i <= number; i++) {
            System.out.println(i);
        }
    }
}
