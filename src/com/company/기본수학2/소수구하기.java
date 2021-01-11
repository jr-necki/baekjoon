package com.company.기본수학2;

import java.util.Scanner;

public class 소수구하기 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m=scanner.nextInt();
        int n=scanner.nextInt();

        for(int i=m;i<=n;i++){
            boolean isSosu=true;
            if(i<3){
                if (i==2){
                    System.out.println(i);
                }
            }else{
                for(int j=2;j<i;j++){
                    if(i%j==0){
                        isSosu=false;
                        break;
                    }
                }
                if(isSosu){
                    System.out.println(i);
                }
            }
        }
    }
}
