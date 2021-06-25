package com.company.기본수학1;
import java.util.Scanner;

public class ACM_10250 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int cases=scanner.nextInt();
        for(int k=0;k<cases;k++){
            int H=scanner.nextInt();
            int W=scanner.nextInt();
            int N=scanner.nextInt();
            int i=N/H+1;
            int d=N%H;
            if(d==0){
                System.out.println(H*100+i-1);
            }else{
                System.out.println(d*100+i);
            }

        }
        scanner.close();

    }
}
