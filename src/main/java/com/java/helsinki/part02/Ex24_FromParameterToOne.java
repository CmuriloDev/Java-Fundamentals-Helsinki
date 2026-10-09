package com.java.helsinki.part02;

public class Ex24_FromParameterToOne {
    public static void main(String[] args){
        printFromNumberToOne(5);
    }
    public static void printFromNumberToOne(int number) {
        for (int i = number; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
