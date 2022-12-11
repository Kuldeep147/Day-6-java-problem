package com.bzl.daysix;

import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
       StopWatch ob = new StopWatch();
       ob.stopWatch();
    }
    public void stopWatch(){
        System.out.println("Enter 1. To start : ");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        long start = System.currentTimeMillis();
        while(s == 1){
            switch (s){
                case 1:
                    System.out.println("Enter any integer other than 1 to stop : ");
                    Scanner sb = new Scanner(System.in);
                    int l = sb.nextInt();
                    s = l;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("Time elapsed is "+(end - start)+" ms. ");
    }
}