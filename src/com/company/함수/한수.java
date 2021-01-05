package com.company.함수;

import java.util.Scanner;

public class 한수 {

    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
      int n=scanner.nextInt();
      int hansu=0;
      for(int i=1;i<=n;i++){
          if(isHansu(i)){
              hansu++;
          }
      }
      System.out.println(hansu);
    }

    private static boolean isHansu(int i) {

        if(i<10){
            return true;
        }else{
            String s=String.valueOf(i);
            String [] arr=s.split("");
            int d=Integer.parseInt(arr[1])-Integer.parseInt(arr[0]);
            for(int j=0;j<arr.length-1;j++){
                if(Integer.parseInt(arr[j])+d!=
                        Integer.parseInt(arr[j+1])){
                    return false;
                }
            }
            return true;

        }
    }
}