package com.company.문자열;

import java.util.Scanner;

public class 상수 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String a=scanner.next();
        String b=scanner.next();
        int x=Integer.parseInt(new StringBuilder().append(a).reverse().toString());
        int y=Integer.parseInt(new StringBuilder().append(b).reverse().toString());
        if(x>y){
            System.out.print(x);
        }else{
            System.out.print(y);
        }

    }
}
