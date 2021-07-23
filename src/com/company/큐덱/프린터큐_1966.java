package com.company.큐덱;

import org.omg.PortableInterceptor.INACTIVE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class 프린터큐_1966 {
    public static void main(String[] args) throws IOException {
        PriorityQueue<Printer> queue = new PriorityQueue<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int tests = Integer.parseInt(st.nextToken());

        ArrayList <Integer> al = new ArrayList<>();

        while (tests --> 0){
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int papers = Integer.parseInt(st2.nextToken()); // 문서 수
            int idx = Integer.parseInt(st2.nextToken()); // 현재 위치
            int i=0;

            StringTokenizer st3 = new StringTokenizer(br.readLine()," "); // 중요도 배열

            while (st3.hasMoreTokens()){ // 중요도에 맞춰서 큐에 넣음
                int priority = Integer.parseInt(st3.nextToken());
                queue.add(new Printer(i,priority));
                i++;
            }

            int k=1;
            while (!queue.isEmpty()){
                if(queue.poll().position == idx){
                    al.add(k);
                    break;
                }
                k++;
            }


        }
        for(Integer i : al ){
            System.out.println(i);
        }

    }

}
class Printer implements Comparable<Printer>{
    public int position;
    public int p;
    public Printer(int i, int priority) {
        this.position=i;
        this.p=priority;
    }
    @Override
    public int compareTo(Printer o) {
        return o.p-this.p;
    }
}