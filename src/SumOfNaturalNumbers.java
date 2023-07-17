package com.bascicprograms;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        // Calculate the sum of N natural numbers
        int sum = 0;
        int i = 1;
        while (i <= N) {
            sum += i;
            i++;
        }

        // Display the sum
        System.out.println("Sum of first " + N + " natural numbers: " + sum);


    }
}
