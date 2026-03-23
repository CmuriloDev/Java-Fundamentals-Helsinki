package com.java.helsinki.part01;

import java.util.Scanner;

public class Ex05_Message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        // Write your program here
        String message = scanner.nextLine();
        System.out.println(message);
    }
}