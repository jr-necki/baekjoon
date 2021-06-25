package com.company.for문;

import java.util.Scanner;

public class 별찍기_1_2438 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=n-i;k>0;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
