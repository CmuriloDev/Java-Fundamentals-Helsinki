package com.java.helsinki.part02;

import java.util.Scanner;

public class Ex01_Squared {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.valueOf(scanner.nextLine());

        int square = number * number;
        System.out.println(square);
    }
}
