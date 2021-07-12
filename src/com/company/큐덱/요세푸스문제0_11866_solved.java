package com.company.큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 요세푸스문제0_11866_solved {
    public static void main(String[] args) throws IOException {
        Queue<Integer>queue=new LinkedList<>();

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");

        int N= Integer.parseInt(st.nextToken());
        int K= Integer.parseInt(st.nextToken());
        int idx=1;

        while (N-->0){
            queue.offer(idx);
            idx++;
        }

        StringBuilder sb=new StringBuilder();
        sb.append("<");
        int i=1;
        while (!queue.isEmpty()){
            if(i==K){
                if(queue.size()!=1){
                    sb.append(queue.poll()+", ");
                }else{
                    sb.append(queue.poll());
                }
                i=1;
            }else{
                int a=queue.poll();
                queue.offer(a);
                i++;
            }
        }
        sb.append(">");
        System.out.println(sb);
    }
}
