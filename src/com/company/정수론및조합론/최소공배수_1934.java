package com.company.정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최소공배수_1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        while (n-->0){
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            int gcd=gcd(a,b);
            System.out.println(a*b/gcd);
        }
    }

    private static int gcd(int a, int b) {
        while(b!=0){
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
}
