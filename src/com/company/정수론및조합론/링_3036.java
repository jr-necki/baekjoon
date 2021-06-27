package com.company.정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 링_3036 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine())-1;
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int first=Integer.parseInt(st.nextToken());
        while (n-->0){
            int next=Integer.parseInt(st.nextToken());
            int a=gcd(first,next);
            StringBuilder sb=new StringBuilder();
            sb.append(first/a+"/"+next/a);
            System.out.println(sb);
        }

        ArrayList<String> al=new ArrayList<>();

    }

    //최대공약수
    private static int gcd(int a, int b) {
        while(b!=0){
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
}
