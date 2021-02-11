package com.company.기본수학1;

import java.util.Scanner;

public class 분수찾기 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        //대각선 홀수번째 올라가는방향
        //대각선 짝수번째 내려가는방향

        int crossNum=1; int countSum=0;
        while(true){
            //지금까지 대각선+해당대각선으로 범위
            if(n<=countSum+crossNum){
                if(crossNum%2==1){
                    //홀수니까 위방향
                    System.out.println(crossNum-(n-countSum-1)+"/"+ (n-countSum));
                    break;
               }
                else{
                    //짝수
                    System.out.println((n-countSum)+"/"+(crossNum-(n-countSum-1)));
                    break;
                }
            }else{
                //범위맞을때까지
                countSum+=crossNum;
                crossNum++;
            }
        }
}
}
