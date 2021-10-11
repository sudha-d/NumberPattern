package com.company;

import java.util.Scanner;

public class Number12 {
    public static void main(String[] args) {

        int i;
        int j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any n value:");
       int n = sc.nextInt();
        for(i=1; i<=n; i++)
        {
            for( j=i; j<=n; j++){
                System.out.print(" ");
            }
            for(j=1; j<=i; j++)
            {

                if(i==n || j==1 || j==i){
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

