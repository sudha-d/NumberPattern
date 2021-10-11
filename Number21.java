package com.company;

import java.util.Scanner;

public class Number21
{
    public static void main(String[] args) {
        int i;
        int j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any n value:");
        int n = sc.nextInt();
        for (i = 1; i <= 2 * n - 1; i++) {
            for (j = 1; j <= 2 * n - 1; j++) {
                if (i == n ||  j ==  n) {
                    System.out.print("1");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
