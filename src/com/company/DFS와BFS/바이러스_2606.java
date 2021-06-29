package com.company.DFS와BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 바이러스_2606 {
    static int [][]arr;
    static boolean[] check;
    static int virus=0;

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int m=Integer.parseInt(br.readLine());
        arr=new int[n+1][n+1];
        check=new boolean[n+1];
        while (m-->0){
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            int s=Integer.parseInt(st.nextToken());
            int v=Integer.parseInt(st.nextToken());
            arr[s][v]=1;
            arr[v][s]=1;
        }
        dfs(1);
        System.out.println(virus);

    }

    private static void dfs(int start) {
        check[start]=true;

        for(int i=1;i<check.length;i++){
            if(i!=start &&check[i]==false&&arr[start][i]==1){
                dfs(i);
                virus++;
            }
        }
    }
}
