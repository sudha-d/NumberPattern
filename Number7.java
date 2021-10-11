/*
 *******
   **  **
    * * * *
      *  *  *
       * * * *
        **   **
         *******
 */
package com.company;

import java.util.Scanner;

public class Number7
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
                if (i==1||i==n||j==1||j==n||i == j || n+1 == i+j)
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
