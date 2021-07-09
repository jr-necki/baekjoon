package com.company.이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


//자꾸 시간초과 뜸..!!!!!


public class 숫자카드2_10816 {
    static HashMap<Integer,Integer> map;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int cards=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int [] cardSet=new int[20000001];
        while (cards-->0){
            cardSet[Integer.parseInt(st.nextToken())+1000000]++;
        }
        int newCards=Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine());
        StringBuffer sb=new StringBuffer();
        while (newCards-->0){
            sb.append(cardSet[Integer.parseInt(st.nextToken())+1000000]+" ");
        }
        System.out.println(sb);
    }
}
