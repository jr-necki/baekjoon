package com.company.이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class 랜선자르기_1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int K = Integer.parseInt(st.nextToken()); // 이미 가지고 있는 랜선 수
        int N = Integer.parseInt(st.nextToken()); // 필요한 랜선 수
        long max = 0;
        long[] lines = new long[K];

        for(int i = 0; i<K; i++){
            lines [i] = Long.parseLong(br.readLine());
            max = Math.max(max, lines[i]);
        }

        // 이분 탐색
        long start = 1;
        long end = max;
        long mid = 0;
        while (start <= end) { // 이분 탐색
            mid = ( start + end )/2; // 중간값 설정
            long cnt = 0;

            for( Long line : lines ){
                cnt+= line/mid;
            }
            if(cnt>= N){
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        System.out.println(end);
    }
}
