package com.company.DFS와BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class 유기농배추_1012 {
    static int M;
    static int N;
    static int K;
    static int [][]map;
    static boolean [][] check;
    static int bug;

    static int [] dx={1,-1,0,0};
    static int [] dy={0,0,1,-1};
    static int cnt=0;

    static ArrayList<Integer>al=new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int time=Integer.parseInt(br.readLine());
        while (time-->0){
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            M=Integer.parseInt(st.nextToken());
            N=Integer.parseInt(st.nextToken());
            K=Integer.parseInt(st.nextToken());
            map=new int[M][N];
            check=new boolean[M][N];
            //배추 지도 초기화
            while (K-->0){
                StringTokenizer input=new StringTokenizer(br.readLine()," ");
                int i=Integer.parseInt(input.nextToken());
                int j=Integer.parseInt(input.nextToken());
                map[i][j]=1;
            }
            for(int i=0;i<M;i++){
                for(int j=0;j<N;j++){
                    if(map[i][j]==1&&!check[i][j]){
                        cnt++;
                        search(i,j);
                    }
                }
            }
            al.add(cnt);
            cnt=0;
        }
        for(Integer i: al){
            System.out.println(i);
        }
    }
    private static void search(int i, int j) {
        check[i][j]=true;
        for(int k=0;k<4;k++){
            int nx=i+dx[k];
            int ny=j+dy[k];
            if(nx>=0&&ny>=0&&nx<M&&ny<N){
                if(map[nx][ny]==1&&!check[nx][ny]){
                    search(nx,ny);
                }
            }
        }
    }
}
