package com.bzl.daysix;

import java.util.Scanner;

public class FibonacciSeries {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        FibonacciSeries fib = new FibonacciSeries();
        fib.fibSeries();
    }
    public void fibSeries(){
        System.out.println("Enter number of terms in series : ");
        int terms = sc.nextInt();
        int[] fibonacciSeries = new int[terms];
        fibonacciSeries[0] = 1;
        fibonacciSeries[1] = 1;
        for (int i = 2; i < terms; i++){
            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
        }
        for(int i = 0; i < fibonacciSeries.length; i++){
            System.out.print(fibonacciSeries[i]+" ");
        }
    }
}