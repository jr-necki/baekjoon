package com.company.정수론및조합론;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class 다리놓기 {

    static int[][] dp = new int[30][30];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());


        for(int i = 0; i < num; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine()," ");

            // nCr 조합
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            System.out.println(combi(n,m));
        }

    }

    static int combi(int n, int r) {

        // 메모이제이션
        if(dp[n][r] > 0) {
            return dp[n][r];
        }
        if(n == r || r == 0) {
            return dp[n][r] = 1;
        }
        return dp[n][r] = combi(n-1, r-1) + combi(n-1, r);
    }
}
