package com.company.문자열;

import java.util.Scanner;

public class 크로아티아알파벳 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        String[]arr=s.split("");
        int n=0;
        int number=arr.length;
        for(int j=0;j<arr.length;j++){
            if(s.charAt(j)=='c'){
                if(s.charAt(j+1)=='='||
                s.charAt(j+1)=='-'){
                    number-=1;
                }
            }else if(s.charAt(j)=='d'){
        }
        System.out.print(n+number);

    }
}}

