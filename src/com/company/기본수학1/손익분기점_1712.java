package com.company.기본수학1;

import java.util.Scanner;

public class 손익분기점_1712 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int i=1;
        if (c<=b){
            System.out.print(-1);
        }else{
            System.out.print((a/(c-b))+1);
        }


    }
}
