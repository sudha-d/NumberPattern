package com.company;

import java.util.Scanner;

public class Number60 {
    public static void main(String[] args) {
        int k = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if((i==1 || i==n) && (j==1 || j==n))
                {
                    System.out.print("0");
                } else if (i== 1||j==1||i==n||j==n) {
                    System.out.print("1");
                }else
                    System.out.print("0");
            }
            System.out.println();
        }
    }
}
