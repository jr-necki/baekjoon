package com.company.기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 검증수_2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=5;
        double sum=0;
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        while (st.hasMoreTokens()){
            sum=sum+Math.pow(Integer.parseInt(st.nextToken()),2);
        }
        System.out.println((int)sum%10);

    }
}
