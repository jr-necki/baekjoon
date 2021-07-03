package com.company.정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class 검문_2981 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> al=new ArrayList<>();
        ArrayList<Integer> arr=new ArrayList<>();

        int n=0;
        n=Integer.parseInt(br.readLine());
        while (n-->0){
            al.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(al);

        int M=2;
        int res=0;

        while (M<=al.get(al.size()-1)){
            for(int i=0;i<al.size();i++){
                if(i==0){
                    res=al.get(i)%M;
                }else{
                    if(res==al.get(i)%M){
                        if(i==al.size()-1){
                            arr.add(M);
                        }
                    }else{
                        break;
                    }
                }
            }
            M++;
        }
        for(Integer i:arr){
            System.out.print(i+" ");
        }

    }
}
