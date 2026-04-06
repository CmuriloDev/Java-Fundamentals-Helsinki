package com.java.helsinki.part02;

import java.util.Scanner;

public class Ex05_CarryOn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Shall we carry on?");
            String response = String.valueOf(scanner.nextLine());
            if (response.equals("no")) {
                break;
            }
        }
    }
}
