package com.company.재귀;

import java.util.Scanner;

public class 팩토리얼 {
    static int factorial=0;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        System.out.println(fac(n));
    }

    private static int fac(int n) {
       if(n<=1){
           return 1;
       }else{
           return n*fac(n-1);
       }
    }
}
