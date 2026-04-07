package com.java.helsinki.part02;

import java.util.Scanner;

public class Ex15_CountingToHundred {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for(int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
