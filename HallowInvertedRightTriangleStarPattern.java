 package com.company;

import java.util.Scanner;

public class HallowInvertedRightTriangleStarPattern
{
    public static void main(String[] args)
    {
        int i;
        int j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any n value:");
        int n = sc.nextInt();
        for(i=1; i<=n; i++)
        {
            for( j=1; j<=i; j++)
            {
                System.out.print(" ");
            }
            for( j=i; j<=n; j++){

                if(j==i || j== n|| i==1)
                {
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

