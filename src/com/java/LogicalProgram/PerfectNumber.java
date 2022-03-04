package com.java.LogicalProgram;

import java.util.Scanner;
//perfect num means: sum of Factors = Number
public class PerfectNumber
{
    public static void  main(String args[])
    {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        n = sc.nextInt();
        int i=1;
        while( i <= n/2 )
        {
            if(n % i == 0)
                sum = sum + i;
            i++;
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
