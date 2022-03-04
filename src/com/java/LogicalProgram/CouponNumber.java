package com.java.LogicalProgram;

import java.util.Scanner;


public class CouponNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Coupon :");
        int n = sc.nextInt();
        generateCoupon(n);
    }


    static void generateCoupon(int random)
    {
        int arr[] = new int[random];
        arr[0] = (int) (Math.random() * random * 10);
        int index = 1;

        while (index < random)
        {
            int rNo = (int)(Math.random() * random * 10);
            boolean flag = true;
            for(int i=0; i < index; i++)
            {
                if(arr[i] == rNo)
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
                arr[index++] = rNo;
        }
        System.out.println("Coupon Number");
        for(int i = 0; i < index; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
