package com.java.helsinki.part02;

import java.util.Scanner;

public class Ex14_Counting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= number; i++) {
            System.out.println(i);
        }
    }
}
