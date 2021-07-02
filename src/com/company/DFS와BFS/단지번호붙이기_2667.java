package com.company.DFS와BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class 단지번호붙이기_2667 {
    static int [][] map;
    static boolean [][] check;
    static ArrayList<Integer>al;
    static int N;
    static int[] dx={1,-1,0,0};
    static int[] dy={0,0,1,-1};
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(br.readLine());
        map=new int[N][N];
        check=new boolean[N][N];
        al=new ArrayList<>();

        //지도 초기화 작업업
       for(int i=0;i<N;i++){
            String input=br.readLine();
            for(int j=0;j<N;j++){
                map [i][j]=input.charAt(j)-'0';
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(!check[i][j]&&map[i][j]==1){
                    cnt++;
                    dfs(i,j);
                    al.add(cnt);
                    cnt=0;
                }
            }
        }
        System.out.println(al.size());
        Collections.sort(al);
        for(Integer i:al){
            System.out.println(i);
        }

    }

    private static void dfs(int i, int j) {
        check[i][j]=true;
        for(int k=0;k<4;k++){
            int nx=i+dx[k];
            int ny=j+dy[k];
            if(nx>=0&&ny>=0&&nx<N&&ny<N){
                if(map[nx][ny]==1&&!check[nx][ny]){
                    cnt++;
                    dfs(nx,ny);
                }
            }
        }
    }
}
