package com.bzl.daysix;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        ReverseNumber ob = new ReverseNumber();
        ob.reverseNumber();

    }
    public void reverseNumber(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer : ");
        n = sc.nextInt();
        int m;
        int reversedNumber = 0;
        while(n > 0){
            m = n % 10;
            n = n/10;
            reversedNumber = (reversedNumber * 10 + m);

        }
        System.out.println("Reversed number : "+reversedNumber);
    }
}