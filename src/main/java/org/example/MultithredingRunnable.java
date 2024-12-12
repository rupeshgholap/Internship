package org.example;

import java.util.Scanner;

public class MultithredingRunnable implements Runnable {


    @Override
    public void run() {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n=sc.nextInt();
        for (int i =1; i<=10; i++)
        {
            System.out.println(" table of "+n+" : "+ i*n);
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        MultithredingRunnable MT = new MultithredingRunnable();
        Thread T= new Thread(MT);
        T.start();

        MultithredingRunnable MT2 = new MultithredingRunnable();
        Thread T2= new Thread(MT2);
        T2.start();



    }

}
