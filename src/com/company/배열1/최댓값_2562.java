package com.company.배열1;

import java.util.Scanner;

public class 최댓값_2562 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int []numbers=new int[9];
        int max=0;
        int maxIdx=-1;
        for(int i=0;i<9;i++){
            int a=scanner.nextInt();
            numbers[i]=a;
            if(max<a){
                max=a;
                maxIdx=i;
            }
        }
        System.out.println(max);
        System.out.println(maxIdx+1);
    }
}
