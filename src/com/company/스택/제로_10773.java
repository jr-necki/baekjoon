package com.company.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class 제로_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack=new Stack<>();
        ArrayList<Integer>answer=new ArrayList<>();
        ArrayList<Integer>zeros=new ArrayList<>();

        int n=Integer.parseInt(br.readLine());
        int num=0;
        while (n-->0){
            num=Integer.parseInt(br.readLine());
            stack.push(num);
        }
        int top=0;
        while (!stack.isEmpty()){
            top=stack.pop();
            if(top==0){
                zeros.add(0);
            }else{
                if(zeros.size()==0){
                    answer.add(top);
                }else{
                    zeros.remove(zeros.size()-1);
                }
            }
        }
        int sum=0;
        for(Integer i:answer){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
