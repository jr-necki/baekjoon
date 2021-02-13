package com.company.백트래킹;

import java.util.Scanner;

public class N과M2 {
    public static int[] arr;
    public static int n, m;

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();

        arr=new int[m];
        dfs(1,0);
    }
    public static void dfs(int now,int depth){
        if(depth==m){
            for(int a:arr){
                System.out.println(a+" ");
            }
            System.out.println();
            return;
        }
        for(int i=now;i<=n;i++){
            arr[depth]=i;
            dfs(i+1,depth+1);
        }
    }
}
