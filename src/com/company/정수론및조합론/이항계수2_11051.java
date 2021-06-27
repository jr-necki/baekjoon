package com.company.정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class 이항계수2_11051 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        int p=10007;
        System.out.println((fac(n) * inverse((fac(n-k) * fac(k))%p, p-2))%p);
    }

    private static int inverse(int i, int p) {//역원
        int a=1;
        while (p>0){
            if(p%2==1){
                a*=i;
                p--;
                a%=p;
            }
            i*=i;
            i%=p;
            p>>=1;
        }
        return a;

    }

    private static int fac(int i) {
        if(i==0) return 1;
        else return i*fac(i-1);
    }
}
