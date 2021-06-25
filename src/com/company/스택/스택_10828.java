package com.company.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 스택_10828 {
    public static int[] stack;
    public static int size=0;

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();

        StringTokenizer st;

        int n=Integer.parseInt(br.readLine());
        stack=new int[n];

        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine()," ");//한줄씩 들어오므로 공백으로 자르기

            switch (st.nextToken()){
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(pop()).append('\n');
                    break;
                case "top":
                    sb.append(top()).append('\n');
                    break;
                case "size":
                    sb.append(size()).append('\n');
                    break;
                case "empty":
                    sb.append(empty()).append('\n');
                    break;
            }
        }
        System.out.println(sb);


    }

    private static int empty() {
        if(size==0){
            return 1;
        }else{
            return 0;
        }
    }

    private static int size() {
        return size;
    }

    private static int top() {
        if (size==0){
            return -1;
        }else{
            return stack[size-1];//맨 마지막꺼
        }
    }

    private static int pop() {
        if(size==0){
            return -1;
        }else{
            int top=stack[size-1];
            stack[size-1]=0;//탑이 있던곳은 0으로
            size--;//사이즈 줄임
            return top;
        }
    }

    private static void push(int num) {
        stack[size]=num;
        size++;
    }
}
