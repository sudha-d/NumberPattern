package com.company;
import java.util.Scanner;
public class Number56 {
    public static void main(String[] args) {
        int k=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++)
            {
                System.out.print(k +" ");
                k++;
            }
            System.out.println("");
        }
    }
}
