package com.java.LogicalProgram;

import java.util.Scanner;
//perfect num means: sum of Factors = Number

/* 6= 1 * 2 * 3 = 1 + 2 + 3 = 6 is a perfect number
  9 = 1 * 3 * 3 = 1 + 3 + 3 = 7 is not perfect number
*
* */
public class PerfectNumber
{
    public static void  main(String args[])
    {
        int n, sum = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        n = sc.nextInt();

       for(int i = 2; i < n; i++)
        {
            if(n % i == 0)
                sum = sum + i;
        }
        //compare the sum with the number
        if(sum == n)
        {
            System.out.println(n+ " is a Perfect Number");
        }
        else
        {
            System.out.println(n+ " is Not Perfect Number");
        }
    }
}
