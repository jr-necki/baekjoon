package com.company.브루트포스;
import java.util.Scanner;

public class 분해합 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        int sLength=s.length();
        int n=Integer.parseInt(s);
        int result=0;

        for(int i=(n-9*sLength);i<n;i++){
            int number=i;
            int sum=0;

            while (number!=0){//각자리수 더하기!!
                sum+=number%10;
                number/=10;
            }
            if(sum+i==n){
                result=i;
                break;
            }
        }
        System.out.println(result);
    }
}

