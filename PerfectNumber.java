package com.bzl.daysix;

import java.util.Scanner;

public class PerfectNumber {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        PerfectNumber ob = new PerfectNumber();
        ob.perfectNumber();
    }
    public void perfectNumber(){
        System.out.println("Enter the number to check Perfect number or not : ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < num; i++){
            if (num%i == 0){
                sum += i;
            }
        }
        if ( sum == num){
            System.out.println("Entered number is a Perfect number.");
        }else {
            System.out.println("Entered number is not an Perfect number.");
        }
    }
}