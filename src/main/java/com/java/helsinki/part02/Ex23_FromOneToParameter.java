package com.java.helsinki.part02;

public class Ex23_FromOneToParameter {
    public static void main (String[] args) {
        printUntilNumber(5);
    }
    public static void printUntilNumber(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }
}