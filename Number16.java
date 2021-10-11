package com.company;
import java.util.Scanner;
public class Number16 {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n value:");
        int n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n * 2 - 1; j++) {
                if (i == n || i + j == n + 1 || j - i == n - 1) {
                    {
                        System.out.print("*");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}