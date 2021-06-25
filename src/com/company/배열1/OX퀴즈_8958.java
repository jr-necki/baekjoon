package com.company.배열1;

import java.util.Scanner;

public class OX퀴즈_8958 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String []arr=new String[n];


        for(int i=0;i<n;i++){
            arr[i]=scanner.next();
        }
        for(int j=0;j<arr.length;j++){
            int point=0;
            int score=0;
            String []a=arr[j].split("");
            for(int k=0;k<a.length;k++){
                if(a[k].equals("O")){
                    point++;
                    score+=point;
                }else{
                    point=0;
                }
            }
            System.out.println(score);
            score=0;
        }

    }
}
