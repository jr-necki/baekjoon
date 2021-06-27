package com.company.정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 패션왕신해빈_9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());

        while (n-->0){
            HashMap<String,Integer> map=new HashMap<>();
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            int ans=1;
            int n1=Integer.parseInt(st.nextToken());
            while (n1-->0){
                StringTokenizer st2=new StringTokenizer(br.readLine()," ");
                String clothes=st2.nextToken();
                String type= st2.nextToken();
                map.put(type, map.getOrDefault(type,0)+1);

            }
            for(String key:map.keySet()){
                ans=ans*(map.get(key)+1);
            }
            System.out.println(ans-1);
        }


    }
}
