package com.company.재귀;

import java.util.Scanner;

public class 하노이탑 {
    public static  StringBuilder sb=new StringBuilder();
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        sb.append((int) (Math.pow(2, n) - 1)).append('\n');
        hanoi(n,1,2,3);
        System.out.println(sb);



    }

    private static void hanoi(int n, int start, int mid, int to) {
        if(n==1){
            sb.append(start+" "+to+"\n");
            return;
        }
        //n-1개를 a-->b
        hanoi(n-1,start,to,mid);
        //1개를 a-->c
        sb.append(start+" "+to+"\n");
        //n-1개를 b-->c로
        hanoi(n-1,mid,start,to);
    }
}
