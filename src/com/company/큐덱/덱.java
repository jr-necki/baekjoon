package com.company.큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 덱 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        ArrayList<Integer>deque=new ArrayList<>();

        while (n-->0){
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            switch (st.nextToken()){
                case "push_front":
                    if(deque.size()==0){
                        deque.add(Integer.parseInt(st.nextToken()));
                    }else{
                        deque.add(deque.get(deque.size()-1));
                        for(int i=deque.size()-1;i>0;i--){
                            deque.set(i,deque.get(i-1));
                        }
                        deque.set(0,Integer.parseInt(st.nextToken()));
                    }
                    break;
                case "push_back":
                    deque.add(Integer.parseInt(st.nextToken()));
                    break;
                case "front":
                    if(deque.size()==0){
                        System.out.println(-1);
                    }else{
                        System.out.println(deque.get(0));
                    }
                    break;
                case "back":
                    if(deque.size()==0){
                        System.out.println(-1);
                    }else{
                        System.out.println(deque.get(deque.size()-1));
                    }
                    break;
                case "size":
                    System.out.println(deque.size());
                    break;
                case "empty":
                    if(deque.size()==0){
                        System.out.println(1);
                    }else{
                        System.out.println(0);
                    }
                    break;
                case "pop_front":
                    if(deque.size()==0){
                        System.out.println(-1);
                    }else{
                        System.out.println(deque.get(0));
                        for(int i=1;i<deque.size();i++){
                            deque.set(i-1,deque.get(i));
                        }
                        deque.remove(deque.size()-1);
                    }
                    break;
                case "pop_back":
                    if(deque.size()==0){
                        System.out.println(-1);
                    }else{
                        System.out.println(deque.get(deque.size()-1));
                        deque.remove(deque.size()-1);
                    }
                    break;
            }
        }
    }
}
