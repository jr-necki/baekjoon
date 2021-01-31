package com.company.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 통계학 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(br.readLine());
        int[]arr=new int[n];
        int []arr2=new int[n+1];
        int sum=0;

        for(int i=0;i<n;i++){
            sum+=arr[i];
            arr2[arr[i]]++;
        }
        Arrays.sort(arr);
        System.out.println(sum/n);
        System.out.println(arr[n/2-1]);
        System.out.println();
        System.out.println(arr[n-1]-arr[0]);
    }
}
