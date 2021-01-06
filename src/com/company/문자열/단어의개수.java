package com.company.문자열;

import java.util.Scanner;

public class 단어의개수 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        String []arr=s.split(" ");
        System.out.print(arr.length);

    }
}
