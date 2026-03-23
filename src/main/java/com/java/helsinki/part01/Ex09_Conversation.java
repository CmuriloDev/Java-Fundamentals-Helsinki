package com.java.helsinki.part01;

import java.util.Scanner;

public class Ex09_Conversation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Greetings! How are you doing?");
        String first = scanner.nextLine();

        System.out.println("Oh, how interesting. Tell me more!");
        String second = scanner.nextLine();

        System.out.println("Thanks for sharing!");
    }
}
