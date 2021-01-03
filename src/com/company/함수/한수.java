package com.company.함수;

import java.util.Scanner;

public class 한수 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int h=0;
        for(int i=1;i<n+1;i++){
             if(isHansu(i)){
                 h++;
             }
        }
        System.out.println(h);
    }

    private static boolean isHansu(int i) {
        if(i<10){
            return true;
        }else{
                String s=String.valueOf(i);
                String[]arr=s.split("");
                int total=0;
                for(int j=0;j<arr.length;j++){
                    total+=Integer.parseInt(arr[j]);
                }
                if((total-Integer.parseInt(arr[0]))%(arr.length-1)==0){
                    return true;
                }
        }
        return false;
    }
}
