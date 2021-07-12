package com.company.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class 괄호_9012_solved {
    public static void main(String[] args) throws IOException {
        Stack<String> stack=new Stack<>();

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());

        while (n-->0){
            String [] arr= br.readLine().split("");
            for(int i=0;i<arr.length;i++){
                if(!stack.isEmpty()){
                    if(stack.peek().equals("(") &&
                        arr[i].equals(")")){
                        stack.pop();
                    }else{
                        stack.push(arr[i]);
                    }
                }else{
                    stack.push(arr[i]);
                }
            }
            if(stack.isEmpty()){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            stack.clear();
        }
    }
}
