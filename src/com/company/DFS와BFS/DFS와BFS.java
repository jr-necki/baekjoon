package com.company.DFS와BFS;


import javafx.event.EventDispatchChain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFS와BFS {
    static int[][]arr;
    static boolean[]check;
    private static StringBuilder sb=new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int n=Integer.parseInt(st.nextToken());//정점의 개수
        int m=Integer.parseInt(st.nextToken());//간선의 개수
        int v=Integer.parseInt(st.nextToken());//시작번호
        arr=new int[n+1][n+1];
        check=new boolean[n+1];
        while (m-->0){
            st=new StringTokenizer(br.readLine()," ");
            int s=Integer.parseInt(st.nextToken());
            int e=Integer.parseInt(st.nextToken());
            //선 연결
            arr[s][e]=1;
            arr[e][s]=1;
        }
        dfs(v);
        sb.append('\n');
        bfs(v);
        System.out.println(sb);


    }

    private static void dfs(int v) {
        sb.append(v+" ");
        check[v]=true;// 방문햇다고 체크
        for(int i=1;i<check.length;i++){
            if(i!=v&&check[i]==false&&arr[v][i]==1){
                dfs(i);
            }
        }
    }
    private static void bfs(int v) {
        initCheck();
        Queue<Integer> queue=new LinkedList<>();
        //시작노드 추가
        queue.add(v);
        check[v]=true;
        while (!queue.isEmpty()){
            int n=queue.poll();
            sb.append(n+" ");
            for(int i=0;i< check.length;i++){
                if(i!=n&&check[i]==false&&arr[n][i]==1){
                    queue.add(i);
                    check[i]=true;
                }
            }
        }

    }

    private static void initCheck() {
        for(int i=0;i< check.length;i++){
            check[i]=false;
        }
    }


}
