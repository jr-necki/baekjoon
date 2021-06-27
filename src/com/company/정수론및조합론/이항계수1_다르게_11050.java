package com.company.정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 이항계수1_다르게_11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());

        int ans=func(n,k);
        System.out.println(ans);
    }

    private static int func(int n,int k) {
        if(n==k||k==0) return 1;
        else{
            return func(n-1,  k-1) + func(n-1,k);
        }
    }
}
