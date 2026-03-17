package com.java.helsinki.part01.Ex08_Greeting;

import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("What's your name?");
        String name = scanner.nextLine();

        System.out.println("Hi " + name);
    }
}
