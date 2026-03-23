package com.java.helsinki.part01;

import java.util.Scanner;

public class Ex08_Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("What's your name?");
        String name = scanner.nextLine();

        System.out.println("Hi " + name);
    }
}
