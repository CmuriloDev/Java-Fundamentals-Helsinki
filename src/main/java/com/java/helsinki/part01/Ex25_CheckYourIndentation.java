package com.java.helsinki.part01;

import java.util.Scanner;

public class Ex25_CheckYourIndentation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a variable: ");
        int first = Integer.parseInt(scan.nextLine());

        System.out.println("Give another variable: ");
        int second = Integer.parseInt(scan.nextLine());

        if (first == second) {
            System.out.println("Variables are equal!");
        } else {
            if (first > second) {
                System.out.println("The first variable is greater than the second!");
            } else {
                System.out.println("The second variable is greater than the first!");
            }
        }
    }
}
