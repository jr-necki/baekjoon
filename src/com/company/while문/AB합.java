package com.company.while문;

import java.util.Scanner;

public class AB합 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        while(scanner.hasNext()){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            System.out.println(a+b);
        }
    }
}
