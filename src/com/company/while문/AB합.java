package com.company.while문;

import java.util.Scanner;

public class AB합 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int sum=1;
        while(sum!=0){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            sum+=a+b;
            System.out.println(sum);
        }
    }
}
