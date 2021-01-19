package com.company.브루트포스;

import java.util.Scanner;

public class 영화감독숌 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int i=1;
        int finalNum=666;
        int a=100;
       while (i!=n){
           finalNum++;
           if (String.valueOf(finalNum).contains("666")){
               i++;
           }
       }
        System.out.println(finalNum);
    }
}
