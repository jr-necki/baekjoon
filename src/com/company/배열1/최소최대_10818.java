package com.company.배열1;

import java.util.Scanner;

public class 최소최대_10818 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int max= -1000000;
        int min=1000000;
        for(int i=0; i<n;i++){
            int x=scanner.nextInt();
            if(max<x){
                max=x;
            }
            if(min>x){
                min=x;
            }
        }
        System.out.println(min+" "+max);
    }
}
