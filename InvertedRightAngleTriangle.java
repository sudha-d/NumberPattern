package com.company;
public class InvertedRightAngleTriangle {
    public static void main(String[] args)
    {
        int j;
        int i;
        for (j = 5; j >= 1; j--) {
            for (i = 1; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
