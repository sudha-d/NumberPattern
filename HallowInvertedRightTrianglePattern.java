package com.company;

import java.util.Scanner;

public class HallowInvertedRightTrianglePattern {
    public static void main(String[] args)
    {

        int i;
        int j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any n value:");
        int n = sc.nextInt();
        for( i=1; i<=n; i++)
        {
            for(j=i; j<=n; j++)
            {

                if(i==1 || j==i || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}