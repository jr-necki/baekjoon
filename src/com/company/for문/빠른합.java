package com.company.for문;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 빠른합 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//선언

        int n= Integer.parseInt(bf.readLine());
        StringTokenizer st;

        for(int i=0;i<n;i++){
            st=new StringTokenizer(bf.readLine()," ");
            bw.write(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+"\n");

        }
        bw.flush();
        bw.close();
        bf.close();

    }

}
