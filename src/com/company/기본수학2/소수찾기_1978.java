package com.company.기본수학2;

import java.util.Scanner;

public class 소수찾기_1978 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sosu = 0;
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            boolean isSosu=true;
            if(x<=2){
                if(x==1){
                    isSosu=false;
                }
            }else{
                for(int j=2;j<x;j++){
                    if(x%j==0){
                        isSosu=false;
                        break;
                    }
                }
            }
            if(isSosu){
                sosu++;
            }
        }
        System.out.println(sosu);


    }


}

