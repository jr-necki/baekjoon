package com.company.DFS와BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;
import java.util.function.BinaryOperator;

public class 바이러스_2606 {
    static int[][] map;
    static boolean[] check;
    static int virus=0;

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int M=Integer.parseInt(br.readLine());

        map=new int[N+1][N+1];
        check=new boolean[N+1];

        //맵 초기화
        for(int i=0;i<M;i++){
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            int s=Integer.parseInt(st.nextToken());
            int e=Integer.parseInt(st.nextToken());
            map[s][e]=1;
            map[e][s]=1;
        }
        dfs(1);
        System.out.println(virus);
    }

    private static void dfs(int v) {
        check[v]=true;
        for(int i=0;i< check.length;i++){
            if(!check[i]&&i!=v&&map[v][i]==1){
                virus++;
                dfs(i);
            }
        }
    }
}
