package com.company;

import java.util.Scanner;

public class Number36 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the n value ");

        int n = sc.nextInt();
        for (int i = n; i >= 1; i--)
        {
            for (int j = i; j >= 1; j--)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
