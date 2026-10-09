package com.java.helsinki.part02;
import java.util.Scanner;

public class Ex22_Reprint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many times?");
        int times = Integer.parseInt(scanner.nextLine());
        
        for (int i = 1; i <= times; i++) {
            printText();
        }
    }
    
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
