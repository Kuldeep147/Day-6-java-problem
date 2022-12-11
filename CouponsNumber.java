package com.bzl.daysix;

import java.util.Random;
import java.util.Scanner;

public class CouponsNumber {
    public static void main(String[] args) {
        couponsNumber();
    }
    public static void couponsNumber(){
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number  of coupons : ");
        int n = sc.nextInt();
        int[] coupons = new int[n];
        for(int i = 0; i < n; i++) {
            int coupon = 0;
            while (coupon < 100000 ){
                int k = r.nextInt(9) + 1;
                coupon = coupon*10 + k;
            }
            coupons[i] = coupon;
        }
        for(int i = 0; i < n; i++){
            System.out.println((i+1)+". "+coupons[i]);
        }
    }
}