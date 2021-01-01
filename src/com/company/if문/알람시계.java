package com.company.if문;

import java.util.Scanner;

public class 알람시계 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int h=scanner.nextInt();
        int m=scanner.nextInt();

        if(m-45<0){
            if(h-1>=0){
                System.out.print(h-1+" ");
            }else{
                System.out.print(23+" ");
            }
            System.out.print((60-45)+m);
        }else{
            System.out.println(h);
            System.out.println(m-45);
        }
    }
}
