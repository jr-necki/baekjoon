package com.company.DFS와BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 토마토_7576 {
    static int [] dx={1,-1,0,0};
    static int [] dy={0,0,1,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");

        int M=Integer.parseInt(st.nextToken());
        int N=Integer.parseInt(st.nextToken());
        int [][] map=new int [N][M];

        for(int i=0;i<N;i++){
            String [] input=br.readLine().split(" ");
            for(int j=0;j<M;j++){
                map[i][j]=Integer.parseInt(input[j]);
            }
        }
        bfs(map,N,M);
    }

    private static void bfs(int[][] map, int N, int M) {
        Queue<Point> queue=new LinkedList<>();
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(map[i][j]==1){//토마토가 담긴 위치를 큐에 넣는다.
                    queue.offer(new Point(i,j));
                }
            }
        }
        while (!queue.isEmpty()){
            Point p= queue.poll();

            for(int i=0;i<4;i++){
                int nx=p.x+dx[i];
                int ny=p.y+dy[i];
                //경계 판별
                if(nx>=0&&ny>=0&&nx<N&&ny<M){
                    if(map[nx][ny]==0){
                        map[nx][ny]=map[p.x][p.y]+1;
                        queue.offer(new Point(nx,ny));
                    }
                }
            }

        }
        int days=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(map[i][j]==0){
                    System.out.println(-1);
                    return;
                }
                days=Math.max(days,map[i][j]);
            }
        }
        System.out.println(days-1);
    }

    private static class Point {
        int x;
        int y;
        Point(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
}
