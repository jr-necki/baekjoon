package com.company.브루트포스;

import java.util.Scanner;

public class 영화감독숌_1436 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        int num=666;
        int count=1;

        while (count!=n){
            num++;
            if(String.valueOf(num).contains("666")){
                count++;
            }
        }
        System.out.println(num);
    }
}
