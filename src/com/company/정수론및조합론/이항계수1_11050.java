package com.company.정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 이항계수1_11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());

        int ans=fac(n)/(fac(k)*fac(n-k));
        System.out.println(ans);
    }

    private static int fac(int i) {
        if(i==0) return 1;
        else return i*fac(i-1);
    }
}
