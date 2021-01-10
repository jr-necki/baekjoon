package com.company.기본수학1;

import java.util.Scanner;

public class 분수찾기 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int th=scanner.nextInt();
        int i=(int)Math.floor(Math.sqrt(th*2));
        int d=th-sum(i-1);
        int x=i-d+1;
        if(i%2==0){
            System.out.println(d+"/"+x);
        }else{
            System.out.println(x+"/"+d);
        }
    }

    private static int sum(int i) {
        return i*(1+i)/2;
    }
}
