package com.company;

import java.util.Scanner;

public class Number44 {
    public static void main(String[] args) {
        int k ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the n value ");

        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            k = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
    }
