package com.company.정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class 약수_1037 {
        public static void main(String[] args) throws IOException {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int n=0;
            n=Integer.parseInt(br.readLine());
            ArrayList<Integer>al=new ArrayList<>();

            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            while (st.hasMoreTokens()){
                al.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(al);
            int ans=0;
            ans=al.get(0)*al.get(n-1);
            System.out.println(ans);
        }
}
