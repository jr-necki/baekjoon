package com.company.입출력과사칙연산;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();

        int b1=b%10;
        int b2=(b%100)/10;
        int b3=b/100;

        int c1=a*b1;
        int c2=a*b2;
        int c3=a*b3;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c1+c2*10+c3*100);
    }
}
