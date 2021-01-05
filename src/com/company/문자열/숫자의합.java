package com.company.문자열;

import java.util.Scanner;

public class 숫자의합 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int sum=0;

            String b=scanner.next();
            String []arr=b.split("");
            for(int j=0;j<arr.length;j++){
                sum+=Integer.parseInt(arr[j]);
            }
        System.out.println(sum);

    }
}
