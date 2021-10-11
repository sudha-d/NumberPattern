package com.company;
import java.util.Scanner;

public class RightArrowStarPattern
{
    public static void main(String[] args)
    {
        int  i, j, k;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        System.out.print("Output:\n");
        for (i = 1; i < n; i++)
        {
            for (j = 0; j < i; j++)
                System.out.print(" ");

            for (k = 0; k < i; k++)
                System.out.print("*");
            System.out.println();
        }
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < n - i; j++)
                System.out.print(" ");

            for (k = 0; k < n - i; k++)
                System.out.print("*");

            System.out.println();
        }
    }
}
