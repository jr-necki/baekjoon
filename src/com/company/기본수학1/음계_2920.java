package com.company.기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 음계_2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        ArrayList<Integer>al=new ArrayList<>();
        String state="";
        while (st.hasMoreTokens()){
            al.add(Integer.parseInt(st.nextToken()));
        }
        for(int i=0;i<al.size()-1;i++){
            if(i==0){
                if(al.get(i)<al.get(i+1)){
                    state="ascending";
                }else{
                    state="descending";
                }
            }else{
                if(al.get(i)<al.get(i+1)){
                    if(!state.equals("ascending")){
                        state="mixed";
                    }
                }else{
                    if(!state.equals("descending")){
                        state="mixed";
                    }
                }
            }
        }
        System.out.println(state);
    }
}
