package com.company;

import java.util.Scanner;

public class Number39 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the n value ");

        int n = sc.nextInt();
        for (int i = 1; i <= n; i++)
        {
            for (int j = i; j <= n; j++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
