package com.company.브루트포스;

import java.util.Scanner;

public class 덩치_7568 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();
        int[][] arr=new int[n][2];

        for(int i=0;i<n;i++){
            arr[i][0]=scanner.nextInt();
            arr[i][1]=scanner.nextInt();
        }

        for(int i=0;i<n;i++){
            int rank=1;
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }else{
                    if(arr[i][0]<arr[j][0]&&arr[i][1]<arr[j][1]){
                        rank++;
                    }
                }
            }
            System.out.print(rank+" ");
        }
    }

}
