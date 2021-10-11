package com.company;

import java.util.Scanner;

public class Number58 {
    public static void main(String[] args) {
        int k = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (k == 1) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
                k = k * -1;
            }
                System.out.println();
            }
        }
    }
