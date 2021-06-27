package com.company.정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팩토리얼0의개수_1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int facN=fac(n);
        String []arr=(String.valueOf(facN)).split("");
        int idx=0;
        for(int i=arr.length-1;i>=0;i--){
            if(!arr[i].equals("0")){
                idx=i;
                break;
            }
        }
        System.out.println(arr.length-idx-1);
    }

    private static int fac(int n) {
        if(n==0) return 1;
        else return n*fac(n-1);

    }
}
