package com.company;

import java.util.Scanner;

public class Number61 {
    public static void main(String[] args) {
        int i;
        int j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any n value:");
        int n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = i; j <= n; j++) {
                System.out.print(j+" ");
            }
            for (j = i; j > 1; j--) {
                System.out.print(n+" ");
            }

            System.out.println();
        }
    }
}

