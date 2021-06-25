package com.company.정렬;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 소트인사이드 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String a=scanner.nextLine();
        String[]arr=a.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
