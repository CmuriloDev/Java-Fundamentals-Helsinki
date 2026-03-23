package com.java.helsinki.part01;

import java.util.Scanner;

public class Ex14_BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Write something:");
        boolean something = Boolean.valueOf(scanner.nextLine());

        System.out.println("True or false? " + something);
    }
}
