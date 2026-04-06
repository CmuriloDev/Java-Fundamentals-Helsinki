package com.java.helsinki.part02;

import java.util.Scanner;

public class Ex07_OnlyPositives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number < 0) {
                System.out.println("Unsuitable number");
                continue;
            } else if (number == 0) {
                break;
            } else {
                int square = number * number;
                System.out.println(square);
            }
        }
    }
}
