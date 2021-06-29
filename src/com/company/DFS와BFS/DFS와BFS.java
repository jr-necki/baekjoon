package com.company.DFS와BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFS와BFS {
    static int[][]arr;
    static  boolean[] check;
    static StringBuilder sb=new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int v=Integer.parseInt(st.nextToken());

        arr=new int[n+1][n+1];
        check=new boolean[n+1];

        //노드,간선 초기화
        for(int i=0;i<m;i++){
            st= new StringTokenizer(br.readLine());
            int s=Integer.parseInt(st.nextToken());
            int e=Integer.parseInt(st.nextToken());
            arr[s][e]=1;
            arr[e][s]=1;
        }
        dfs(v);
        sb.append('\n');
        bfs(v);
        System.out.println(sb);

    }

    private static void initCheck() {
        for(int i=0;i< check.length;i++){
            check[i]=false;
        }
    }

    private static void bfs(int start) {
        //check배열 초기화
        initCheck();
        Queue<Integer>queue=new LinkedList<>();
        //시작노드 추가
        queue.add(start);
        check[start]=true;
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


    private static void dfs(int start) {
        //경로
        sb.append(start+" ");
        check[start]=true;

        for(int i=1;i< check.length;i++){
            //현재 노드와 다른 노드중 미방문&간선 존재
            if(i!=start&&check[i]==false&&arr[start][i]==1)
                dfs(i);
        }
    }
}
