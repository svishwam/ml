package com.vishwa;

import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 1200;
        int r = 2;
        int count=0;
        while(n>0){
            int rem=n%10;
            if (rem==r){
                count+=1;
            }
            n=n/10;
        }
        System.out.println(count);
        System.out.println(count);
    }
}
