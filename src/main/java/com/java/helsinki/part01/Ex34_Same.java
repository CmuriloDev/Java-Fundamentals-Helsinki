package com.java.helsinki.part01;

import java.util.Scanner;

public class Ex34_Same {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here.
        System.out.println("Enter the first string:");
        String word = String.valueOf(scan.nextLine());

        System.out.println("Enter the second string:");
        String word2 = String.valueOf(scan.nextLine());

        if (word.equals(word2)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
