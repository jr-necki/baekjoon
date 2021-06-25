package com.company.재귀;

import java.util.Scanner;

public class 피보나치 {

    static int x=0;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(fibo(n));
    }

    private static int fibo(int n) {
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }
       return fibo(n-1)+fibo(n-2);
    }
}
