package com.company;
import java.util.Scanner;
public class InvertedMirroredRightTriangleStarrPattern {
    public static void main(String[] args) {
        int i;
        int j, k;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any n value:");
        int n = sc.nextInt();
        int count = 1;
        for (i = 1; i <= 2 * n - 1; i++) {
            for (k = 1; k <= n - count; k++)
            {
                System.out.print(" ");
            }
            for (j = 1; j <= count; j++) {
                System.out.print("*");
            }
            System.out.println();
            count = i < n ? count + 1 : count - 1;
        }
    }
}