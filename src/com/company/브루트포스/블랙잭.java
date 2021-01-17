package com.company.브루트포스;

import java.util.Arrays;
import java.util.Scanner;

public class 블랙잭 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int[] cards=new int[m];
        for(int i=0;i<n;i++){
            cards[i]=scanner.nextInt();
        }
        System.out.println(search(cards,n,m));



        }

    private static int search(int[] cards, int n, int m) {
        int sum=0;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    int temp=cards[i]+cards[j]+cards[k];

                    if(temp==m){
                        return temp;
                    }
                    if(sum<temp && temp<m){
                        sum=temp;
                    }
                }
            }
        }
        return sum;
    }

}

