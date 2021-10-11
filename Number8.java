/*

 *****
 *   *
 *   *
 *   *
 *****
                 */
package com.company;

import java.util.Scanner;

public class Number8
{
    public static void main(String[] args)
    {

        int i;
        int j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any n value:");
        int n = sc.nextInt();
        for (i=1; i <= n; i++)
        {
            for (int k = 1;k <=i-1;k++ )
            {
                System.out.print(" ");
            }
            for (j = 1; j <= n; j++)
            {
                if (i==1||j==1||i==n||j==n)
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
