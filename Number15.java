package com.company;
import java.util.Scanner;
public class Number15
{
    public static void main(String[] args)
    {
        int i,j,k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n = sc.nextInt();
        for(i=1; i <=n;i++)
        {
            for(k=1;k <=n-i;k++)
            {
                System.out.print(" ");
            }
            for(j=1;j <= i*2-1;j++)
            {
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}
