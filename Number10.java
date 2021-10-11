/*
 *
 **
 * *
 *  *
 *****

 */
package com.company;

import java.util.Scanner;

public class Number10
{
    public static void main(String[] args) {

        int i;
        int j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any n value:");
        int n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++)
            {
                if (j==1||i==j||i == n  )
                {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
