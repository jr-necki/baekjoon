package com.company.배열1;

import java.util.HashSet;
import java.util.Scanner;

public class 나머지_3052 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        HashSet<Integer> h=new HashSet<Integer>();//중복 자동제거!!
        for(int i=0;i<10;i++){
            h.add(scanner.nextInt()%42);
        }
        System.out.println(h.size());
    }
}
