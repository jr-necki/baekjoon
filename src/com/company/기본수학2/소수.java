package com.company.기본수학2;

import java.util.Scanner;

public class 소수 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int sum=0;
        int min=10000;
        for(int i=a;i<=b;i++){
            boolean isSosu=true;
            if(i<3){
                if (i==1){
                    isSosu=false;
                }
            }else{
                for(int j=2;j<i;j++){
                    if(i%j==0){
                        isSosu=false;
                        break;
                    }
                }
            }
            if(isSosu){
                sum+=i;
                if(min>i){
                    min=i;
                }
            }
        }
        if(sum==0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(min);
        }

    }
}
