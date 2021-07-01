package com.company.DFS와BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 미로탐색_2178 {
    static int[] dx={1,-1,0,0};
    static int[] dy={0,0,1,-1};
    private static int[][] check;
    static int [][]map;
    static int M;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        M=Integer.parseInt(st.nextToken());
        N=Integer.parseInt(st.nextToken());
        //(1,1) 바로 넣으려고 이렇게 함
        map=new int[M+1][N+1];
        check=new int[M+1][N+1];
        //지도 초기화 작업
        for(int i=1;i<=M;i++){
            String input=br.readLine();
            for(int j=1;j<=N;j++){
                map[i][j]=input.charAt(j-1)-'0';// 해당 위치에 정수 0또는1 대입
            }
        }
        search();
    }

    //bfs
    public static void search() {
        Queue<Point> queue=new LinkedList<>();
        //(1,1) 시작점 큐에 넣고 시작
        check[1][1]=1;
        queue.offer(new Point(1,1));

        while (!queue.isEmpty()){
            //큐에서 젤 앞에꺼 꺼냄
            int x=queue.peek().x;
            int y=queue.peek().y;
            queue.poll();
            //그 위치에서 상하좌우 살피기
            for(int k=0;k<4;k++){
                int nx=x+dx[k];
                int ny=y+dy[k];
                //그 경계안에 있다면
                if(isBoundary(nx,ny)){
                    if(check[nx][ny]==0){
                        //이동횟수 체크에 넣기
                        check[nx][ny]=check[x][y]+1;
                        //그 지점 큐에 넣음
                        queue.offer(new Point(nx,ny));
                    }
                }
            }
        }
        System.out.println(check[M][N]);
    }
    //경계확인 하는곳
    public static boolean isBoundary(int i,int j){
        if(i<1||j<1||i>M||j<1||j>N){//경계를 지남
            return false;
        }
        if(check[i][j]!=0 || map[i][j]==0){//체크가 0이 아니라면 이미간곳 맵이 0이라면 갈 수 없는 곳
            return false;
        }
        return true;
    }

    // 점 클래스
    private static class Point {
        int x;
        int y;
        public Point(int i,int j){
            this.x=i;
            this.y=j;
        }
    }
}
