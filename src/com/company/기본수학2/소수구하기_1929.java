package com.company.기본수학2;

import java.util.Scanner;

public class 소수구하기_1929 {
    public static boolean[]prime;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m=scanner.nextInt();
        int n=scanner.nextInt();

        prime=new boolean[n+1];
        checkSosu();
        for(int i=m;i<=n;i++){
            //false=소수
            if(!prime[i]){
                System.out.println(i);
            }

        }


    }
    //에라토스테네스의 체
    private static void checkSosu() {
        prime[0]=prime[1]=true;
        for(int i=2;i<=Math.sqrt(prime.length);i++){
            if(prime[i]){
                continue;
            }for(int j=i*i;j<prime.length;j+=i){
                prime[j]=true;
            }
        }
    }
}
