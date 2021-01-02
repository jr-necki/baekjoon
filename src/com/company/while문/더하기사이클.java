package com.company.while문;

import java.util.Scanner;

public class 더하기사이클 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int tmp=0;
        int num=a;
        int n=0;
        int x=0; int y=0;
        boolean finish=false;

        while(!finish){
            if(a>0){
                x=num/10;//10의자리
                y=num%10;//1의자리
                tmp=(x+y)%10;
                num=y*10+tmp%10;
            }else{
                num=num*10+num;
            }
            n++;
            if (num==a){
                finish=true;
            }
        }

        System.out.println(n);

    }
}
