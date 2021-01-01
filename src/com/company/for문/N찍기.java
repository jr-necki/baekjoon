package com.company.for문;

import java.util.Scanner;

public class N찍기 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int c=a+b;
            System.out.println("Case #"+i+": "+a+" + "+b+" = "+c);
        }
    }
}
