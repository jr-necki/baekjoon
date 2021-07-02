package com.company.DFS와BFS;


import javafx.event.EventDispatchChain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFS와BFS_1260 {
    static int [][] map;
    static boolean [] check;
    static int N;
    static int M;
    static StringBuilder sb=new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());
        int V=Integer.parseInt(st.nextToken());
         map=new int[N+1][N+1];
         check=new boolean[N+1];

        //정점&간선 초기화
        while (M-->0){
            StringTokenizer input=new StringTokenizer(br.readLine()," ");
            int s=Integer.parseInt(input.nextToken());
            int e=Integer.parseInt(input.nextToken());
            map[s][e]=1;
            map[e][s]=1;
        }
        dfs(V);
        sb.append('\n');
        for(int i=0;i< check.length;i++){
            check[i]=false;
        }
        bfs(V);
        System.out.println(sb);
    }

    private static void bfs(int v) {//너비 우선 탐색
        Queue<Integer>queue=new LinkedList<>();
        check[v]=true;//노드 방문 체크
        queue.offer(v);//큐에 방문한 노드를 집어넣음

        while (!queue.isEmpty()){//큐가 비어 있을 때 까지
            int n=queue.poll();//제일 앞에 큐 뽑음
            sb.append(n+" ");
            for(int i=0;i<check.length;i++){//노드들 중에서...
                if(i!=v&&!check[i]&&map[n][i]==1){//v가 아니고 방문안됐고 n과 연결되어있는 노드!!
                    check[i]=true;//방문 체크
                    queue.add(i);//큐에 넣음
               }
            }
        }
    }

    private static void dfs(int v) {//깊이 우선 탐색
        check[v]=true;
        sb.append(v+" ");
        for(int i=1;i<check.length;i++){//노드들 중에서...
            if(!check[i]&&i!=v&&map[v][i]==1){//방문 안됐고 v가 아니고 v와 연결되어있는 노드!!!
                dfs(i);// 그 노드를 또 탐색
            }
        }
    }
}
