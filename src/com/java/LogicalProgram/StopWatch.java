package com.java.LogicalProgram;

import java.util.Scanner;

public class StopWatch
{
    long startTimer = 0;
    long stopTimer = 0;
    long elapses = 0;
    public long start()
    {
        startTimer = System.currentTimeMillis();
        System.out.println("Starting Time : "+startTimer);
        return startTimer;
    }

    public long stop()
    {
        stopTimer = System.currentTimeMillis();
        System.out.println("Stoping Time : " +stopTimer);
        return stopTimer;
    }

    public long getElapses()
    {
        elapses  = stopTimer - startTimer;
        return elapses;
    }
    public static void main(String[] args)
    {
         StopWatch sw = new StopWatch();
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter to start Timer : ");
         int num = sc.nextInt();
         sw.start();
         System.out.println("Enter to Stop Timer : ");
         int num2 = sc.nextInt();
         sw.stop();

        System.out.println();
        long l = sw.getElapses();
        System.out.println("Elspse Time in miliseconds : " +l + " milliseconds");
        System.out.println();
        int seconds = (int) (l/1000);  //1000 miliseconds = 1 second
        System.out.println("Elaspe Time in Seconds : " +seconds + " seconds");
        System.out.println();
        int minute = seconds/60;  //
        System.out.println("Elaspe Time in Minutes : " + minute+ " minutes");
    }
}
