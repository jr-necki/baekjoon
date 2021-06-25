package com.company.문자열;

import java.util.Scanner;

public class 문자열반복_2675 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int cases=scanner.nextInt();

        for(int i=0;i<cases;i++){
            String out="";
            int n=scanner.nextInt();
            String s=scanner.next();
            String[]arr=s.split("");
            for(int j=0;j<arr.length;j++){
                for (int k=0;k<n;k++){
                    out+=arr[j];
                }
            }
            System.out.println(out);
        }
    }
}
