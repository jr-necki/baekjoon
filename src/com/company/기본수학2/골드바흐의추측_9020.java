package com.company.기본수학2;

import java.util.Scanner;

public class 골드바흐의추측_9020 {
    static boolean[] prime=new boolean[10001];
    public static void main(String[] args) {

        getPrime();//에라토네스체로 소수 세팅!
        Scanner scanner=new Scanner(System.in);
        int cases=scanner.nextInt();
        for(int i=0;i<cases;i++){
            int n=scanner.nextInt();
            int x=n/2;
            int y=n/2;

            while (true){
                if(!prime[x]&&!prime[y]){
                    System.out.println(x+" "+y);
                    break;
                }
                x--;
                y++;
            }
        }
    }

    private static void getPrime() {
        prime[0]=prime[1]=true;
        for(int i=2; i<=Math.sqrt(prime.length);i++){
            if(prime[i]) continue;
            for(int j=i*i;j<prime.length;j+=i){
                prime[j]=true;
            }
        }
    }

}
