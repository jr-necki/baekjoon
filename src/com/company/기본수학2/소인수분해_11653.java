package com.company.기본수학2;

import java.util.Scanner;

public class 소인수분해_11653 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int i=2;
        while (n!=1){
            if(n%i==0){
                System.out.println(i);
                n=n/i;
            }else{
                i++;
            }
        }

    }
}
