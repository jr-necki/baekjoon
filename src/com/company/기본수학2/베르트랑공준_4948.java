package com.company.기본수학2;

import java.util.Scanner;

public class 베르트랑공준_4948 {
    public static boolean[] sosu = new boolean[246913];
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        checkSosu();
        while(true){
            int n=scanner.nextInt();
            if(n==0){
                break;
            }
            int count=0;
            for(int i=n+1;i<=2*n;i++){
                if(!sosu[i]){
                    count++;
                }
            }
            System.out.println(count);
        }

    }

    private static void checkSosu() {
        sosu[0]=sosu[1]=true;
        for (int i=2;i<Math.sqrt(sosu.length);i++){
            if(sosu[i]){
                continue;
            }
            for(int j=i*i;j<sosu.length;j+=i){
                sosu[j]=true;
            }
        }
    }
}
