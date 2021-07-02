package com.company.DFS와BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 숨바꼭질_1697 {
    static int[] point;
    static  int dx[]={1,-1,2};
    static int N;
    static int K;
    public static void main(String[] args) throws IOException {
        point=new int [100001];

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");

        N=Integer.parseInt(st.nextToken());
        K=Integer.parseInt(st.nextToken());

        if(N==K){
            System.out.println(0);
        }else{
            bfs(N);
        }
    }
    private static void bfs(int n) {
        Queue<Integer> queue=new LinkedList<>();
        point[n]=1;
        queue.offer(n);

        while (!queue.isEmpty()){
            int x=queue.poll();
            for(int k=0;k<3;k++) {
                int nx;
                if (k == 2) {
                    nx = x * 2;
                } else {
                    nx = x + dx[k];
                }
                if(nx==K){
                    System.out.println(point[x]);
                    return;
                }
                if(nx>=0&&nx<point.length&&point[nx]==0){
                    queue.add(nx);
                    point[nx]=point[x]+1;
                }
            }
        }

    }
}
