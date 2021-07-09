package com.company.큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 카드2 {
    public static void main(String[] args) throws IOException {
        Queue<Integer> queue=new LinkedList<>();

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int cards=Integer.parseInt(br.readLine());
        int i=1;
        //카드 세팅팅
       while (cards-->0){
            queue.add(i);
            i++;
        }
       while (queue.size()!=1){
           queue.poll();
           int card=queue.poll();
           queue.add(card);
       }
       System.out.println(queue.peek());
    }
}
