package com.company.기본수학2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 직각삼각형 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int []arr=new int[3];
        while(true){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int c=scanner.nextInt();
            if(a==0&&b==0&&c==0){
                break;
            }else{
                arr[0]=a;
                arr[1]=b;
                arr[2]=c;
                Arrays.sort(arr);
                if((arr[2]*arr[2])==(arr[0]*arr[0]+arr[1]*arr[1])){
                    System.out.println("right");
                }
                else{
                    System.out.println("wrong");
                }
            }

        }
    }
}
