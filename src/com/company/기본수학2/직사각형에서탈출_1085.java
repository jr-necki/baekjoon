package com.company.기본수학2;

import java.util.Scanner;

public class 직사각형에서탈출_1085 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        int w=scanner.nextInt();
        int h=scanner.nextInt();

        if(w-x>x){
            if(h-y>y){
                if(y>x){
                    System.out.println(x);
                }else{
                    System.out.println(y);
                }
            }else{
                if (h-y>x){
                    System.out.println(x);
                }else{
                    System.out.println(h-y);
                }

            }
        }else{
            if(h-y>y){
                if(y>w-x){
                    System.out.println(w-x);
                }else{
                    System.out.println(y);
                }
            }else{
                if(h-y>w-x){
                    System.out.println(w-x);
                }else{
                    System.out.println(h-y);
                }
            }
        }


    }
}
