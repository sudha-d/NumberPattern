package com.company;

import java.util.Scanner;

public class XstarPattern
{
    public static void main(String[] args)
    {
        int i;
        int j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any n value:");
        int n = sc.nextInt();
        for (i = 1; i <= 2 * n - 1; i++) {
            for (j = 1; j <= 2 * n - 1; j++) {
                if (i == j || i + j == 2 * n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}