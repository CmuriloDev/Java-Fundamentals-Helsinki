package com.java.helsinki.part02;

import java.util.Scanner;

public class Ex26_DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(5, 25);
    }
    public static void divisibleByThreeInRange(int beginning, int end){
        for (int i = beginning; i <= end; i++ ) {
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
    }

}
