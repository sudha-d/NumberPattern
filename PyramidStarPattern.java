
package com.company;

public class PyramidStarPattern
{
    public static void main(String[] args)
    {

        int i;
        int j;
        for (i=1; i <= 10; i++)
        {
            for (j = 1; j <= 10; j++)
            {
                if (i==1||i==10||j==1||j==10||i == j)
                {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
