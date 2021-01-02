package com.company.배열1;

import java.util.Scanner;

public class 평균은넘었겠지 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int []std=new int[n];


        for(int i=0;i<n;i++){
            int score=0;
            int total=0;
            int avg=0;
            int num=0;
            int max=0;
            int j=0;
            int overAvg=0;
            while (scanner.hasNext()){
                score=scanner.nextInt();
                std[j]=score;
                total+=score;
                j++;
                num++;
            }
            avg=total/num;
            for (int k=0;k<std.length;k++){
                if(std[k]>avg){
                    overAvg++;
                }
            }
            System.out.println(overAvg/total*100+"%");
        }

    }
}
