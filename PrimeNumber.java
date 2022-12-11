package com.bzl.daysix;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        String k =  primeNumber();
        System.out.println(k);
    }
    public static String primeNumber(){
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an positive integer to check prime number : ");
        n = sc.nextInt();
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return "Number "+n+" is not Prime Number";
            }
        }return "Number "+n+" is a Prime Number";
    }
}