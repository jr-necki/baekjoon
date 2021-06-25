package com.company.백트래킹;

import java.util.Scanner;

public class N과M1 {
    public  static int[]arr;
    public  static boolean[]visit;


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();//1부터 n까지
        int m=scanner.nextInt();//수열을 구성하는 수의 개수

        arr=new int[m];
        visit=new boolean[n];
        dfs(n,m,0);

    }
    public static void dfs(int n,int m,int depth){
        if(depth==m){
            for(int i=0;i<m;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        }
        for(int i=0;i<n;i++){
            if(!visit[i]){
                visit[i]=true;
                arr[depth]=i+1;
                dfs(n,m,depth+1);
                visit[i]=false;
            }
        }
    }
}
