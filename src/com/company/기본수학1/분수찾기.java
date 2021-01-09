package com.company.기본수학1;

import java.util.Scanner;

public class 분수찾기 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int th=scanner.nextInt();
        boolean ok=false;
        int i=2;
        String x="";
        while(!ok){
            if((i-1)*(2+i)/2<th-1&&
                    i*(3+i)/2<=th-1){
                int d=th-1-(i-1)*(2+i)/2;
                if(i%2==0){
                    int a=i+2+d;
                    int b=d;
                    System.out.println(a+"/"+b);
                }else{
                    int a=d;
                    int b=i-d+1;
                    System.out.println(a+"/"+b);
                }
                ok=true;
            }else{
                i++;
            }
        }


    }
}
