package com.company.정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 배수와약수_5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int sum=1;
        int a=0;
        int b=0;

        while (true){
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            a=Integer.parseInt(st.nextToken());
            b=Integer.parseInt(st.nextToken());
            sum=a+b;
            if(sum==0) break;
            if(b%a==0){
                System.out.println("factor");
            }else if(a%b==0){
                System.out.println("multiple");
            }else{
                System.out.println("neither");
            }
        }
    }
}