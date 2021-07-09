package com.company.큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 큐_10845 {
    private static ArrayList<Integer> al=new ArrayList<>();
    static StringBuilder sb=new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st;
        while (n-->0){
            st=new StringTokenizer(br.readLine()," ");
            switch (st.nextToken()){
                case "push":
                    int k=Integer.parseInt(st.nextToken());
                    al.add(k);
                    break;
                case "front":
                    if(al.size()!=0){
                        System.out.println((al.get(0)));
                    }else{
                        System.out.println(-1);
                    }
                    break;
                case "back":
                    if(al.size()!=0){
                        System.out.println(al.get(al.size()-1)+" ");

                    }else{
                        System.out.println(-1);
                    }
                    break;
                case "size":
                    System.out.println(al.size());
                    break;
                case "empty":
                    if(al.size()==0){
                        System.out.println(1);
                    }else{
                        System.out.println(0);
                    }
                    break;
                case "pop":
                    if(al.size()!=0){
                        System.out.println(al.get(0));
                        for(int i=1;i<al.size();i++){
                            al.set(i-1,al.get(i));
                        }
                        al.remove(al.size()-1);
                    }else{
                        System.out.println(-1);
                    }
                    break;
            }
        }
    }

}
