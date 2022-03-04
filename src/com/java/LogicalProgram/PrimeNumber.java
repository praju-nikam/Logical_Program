package com.java.LogicalProgram;

import java.util.Scanner;
//Prime num is divided by 1 or itself only
public class PrimeNumber
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number : " );
        int n = sc.nextInt();
        int m = 0, flag = 0;
        m = n/2 ;
        if( n == 0 || n == 1)
        {
            System.out.println( n+ " is Prime Number");
        }
        else
        {
            for(int i = 2; i <= m; i++ )
            {
                if(n % i == 0)
                {
                    System.out.println(n+ " is Not Prime Number");
                    flag = 1;
                    break;
                }
            }

            if(flag == 0)
            {
                System.out.println(n+ " is Prime Number");
            }
        }
    }
}
