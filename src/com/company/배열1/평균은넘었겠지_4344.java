package com.company.배열1;

import java.util.Scanner;

public class 평균은넘었겠지_4344 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int cases=scanner.nextInt();
        int [] scores;


        for (int i=0;i<cases;i++){
            int n=scanner.nextInt();
            int total=0;
            double avg=0;
            int overAvg=0;
            double ratio=0.0;
            scores=new int[n];
            for(int j=0;j<scores.length;j++){
                scores[j]=scanner.nextInt();
                total+=scores[j];
            }
            avg=total/scores.length;
            for (int k=0;k<scores.length;k++){
                if(avg<scores[k]){
                    overAvg++;
                }
            }
            ratio = (double) overAvg / (double) n * (double) 100;
            System.out.println(String.format("%.3f", ratio) + "%");
        }
    }
}
